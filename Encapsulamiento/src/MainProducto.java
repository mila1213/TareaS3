import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto p1 = new Producto();
        p1.setNombre("TV");
        p1.setPrecio(2000);
        System.out.println("Producto 1" +  "\nNombre: " + p1.getNombre() + "\nPrecio: " + p1.getPrecio());

        Producto p2 = new Producto();
        System.out.printf("Ingrese el nombre del producto:");
        String nombreIngresado = sc.nextLine();
        p2.setNombre(nombreIngresado);

        System.out.printf("Ingrese el precio del producto:");
        double precioIngresado = sc.nextDouble();
        p2.setPrecio(precioIngresado);
        System.out.printf("Producto 2"+ "\nNombre: " + p2.getNombre() + "\nPrecio: " + p2.getPrecio());
    }
}
