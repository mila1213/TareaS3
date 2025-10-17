import java.util.Scanner;

class Producto {
    private double precio;
    private String nombre;
    void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no es válido");
        }
    }

    double getPrecio() {
        return precio;
    }

    void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no es válido");
        }
    }

    String getNombre() {
        return nombre;
    }

}