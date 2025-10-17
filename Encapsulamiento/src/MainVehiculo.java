import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese la velocidad máxima: ");
        int velocidadMax = sc.nextInt();
        sc.nextLine();
        Vehiculo auto = new Vehiculo(marca, velocidadMax);
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = sc.nextLine();
        auto.setModelo(modelo);
        System.out.print("Ingrese el código de seguridad: ");
        String codigo = sc.nextLine();
        auto.setCodigoSeguridad(codigo);
        System.out.print("Ingrese el color del vehículo (rojo, azul, blanco): ");
        String color = sc.nextLine();
        auto.setColor(color);
        System.out.println("Marca: " + auto.marca);
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Velocidad máxima: " + auto.getVelocidadMaxima());
        System.out.println("Color: " + auto.getColor());

        //Error
        // System.out.println(auto.codigoSeguridad);
    }
}
