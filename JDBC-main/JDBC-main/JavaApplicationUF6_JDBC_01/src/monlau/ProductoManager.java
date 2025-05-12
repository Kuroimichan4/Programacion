
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        
        ProductoDAO producto =new ProductoDAOImpl();
        
        //agregar nuevo producto
        producto.insert(new Producto(201,"Pollo",10.0));
        
        //obtener el producto con el ID = 100
        Producto p = producto.read(201);
        System.out.println(p);
        
        
        // update y delete
        p.setNombre("Pollo Asado");
        p.setPrecio(12.5);
        producto.update(p);
        System.out.println("Producto actualizado.");
        
        Producto actu = producto.read(201);
        System.out.println("Producto actualizado a: " + actu);
        
        //delete
        producto.delete(p);
        System.out.println("Producto eliminado");
        
        //comprobar si se ha elimindao
        Producto eliminado = producto.read(201);
        if(eliminado == null) {
            System.out.println("Producto no encontrado");
        } else {
            System.out.println("Producto existente");
        }
        
    }
}
