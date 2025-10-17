import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria1 c = new CuentaBancaria1();
        System.out.print("Ingrese el nombre del titular: ");
        c.setTitular(sc.nextLine());
        System.out.println("Titular: " + c.getTitular());

        System.out.print("Ingrese monto a depositar: ");
        double deposito = sc.nextDouble();
        c.depositar(deposito);
        System.out.println("Saldo actual: " + c.getSaldo());

        System.out.print("Ingrese monto a retirar: ");
        double retiro = sc.nextDouble();
        c.retirar(retiro);
        System.out.println("Saldo actual: " + c.getSaldo());
    }
}
