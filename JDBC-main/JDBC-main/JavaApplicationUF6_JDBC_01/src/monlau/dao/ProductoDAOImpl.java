/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monlau.dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import monlau.model.Producto;
import java.sql.*;

/**
 *
 * @author user
 */
public class ProductoDAOImpl implements ProductoDAO {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/producto_miriam";
    static final String DB_USR = "root";
    static final String DB_PWD = "";

    /**
     * Load the driver class
     */
    private void registerDriver() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            //System.out.println("ERROR: failed to load MySQL JDBC Driver");
            System.err.println("ERROR: failed to load MySQL JDBC Driver"); // imprime en la salida standar de error
            ex.printStackTrace();
        }
    }

    public void insert(Producto producto) {
        Connection conn = null;
        try {
            registerDriver();
            // abrir la conexión
            conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PWD);
            Statement stmt = conn.createStatement(); //Crea un objeto para enviar una orden SQL (inserts/updates/deletes/select) a la BBDD
            // envia la consulta insert con el executeUpdate()
            stmt.executeUpdate("insert into producto values ("
                    + producto.getId() + ",'"
                    + producto.getNombre() + "',"
                    + producto.getPrecio() + ");");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void update(Producto producto) {
        Connection conn = null;
        try {
            registerDriver();
            // abrir la conexión
            conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PWD);
            // Creamos el objeto con la orden para SQL
            PreparedStatement ps = conn.prepareStatement("UPDATE producto SET nombre = ?, precio = ? WHERE id = ?");
            //también se puede hacer de esta forma para que sea mas entendible y tal
//            String sql = "UPDATE producto SET nombre = ?, precio = ? WHERE id = ?";
//            PreparedStatement ps = conn.prepareStatement(sql);
            
            // para sustituir los  ? de la sentencia SQL
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getId());
            
            ps.executeUpdate();
            ps.close(); //esto cierra  el recurso de los Statements que al parecer si no se cierran consumen memoria tanto de la app como de la BBDD
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void delete(Producto producto) {
        Connection conn = null;
        try {
            registerDriver();
            // abrir la conexión
            conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PWD);
            String sql = "DELETE FROM producto WHERE id = ?"; //en este caso se pone la sentencia para dropear el producto
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, producto.getId());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }    
    }

 

    public Producto read(Integer id) {
        Connection conn = null;
        Producto prod = null;
        try {
            registerDriver();
            // abrir la conexión
            conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PWD);
            // consulta select (selecciona el producto con id especificado)
            try (PreparedStatement ps = conn.prepareStatement("select * from producto where id = ?")) { // ps sustituye el id
                //indicar el id que buscamos
                ps.setInt(1, id); // ps indica el cambio del "?"
                //ejecutar la consulta
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // obtener cada una de las columnas y mapearlas a la clase Product
                        prod = new Producto(id, rs.getString("nombre"), rs.getDouble("precio"));
                    }
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return prod;
    }

}
