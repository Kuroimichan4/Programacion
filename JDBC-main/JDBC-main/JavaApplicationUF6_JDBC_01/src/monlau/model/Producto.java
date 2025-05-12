package monlau.model;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
/**
* Clase que representa un producto en el inventario
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;
 
    // Como  llombok no va bien lo pongo manual
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + String.format("%.2f", precio) +
                "€}";
    }
 
    // getters y setters manuale s xq no va bien loombok por algún motivo
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public double getPrecio() {
        return precio != null ? precio : 0.0;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    public int getId() {
        return id != null ? id : 0;
    }
}