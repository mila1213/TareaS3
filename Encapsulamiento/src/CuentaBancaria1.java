
import java.util.Scanner;
class CuentaBancaria1 {
    private double saldo = 0;
    private String titular;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Monto inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Monto de retiro inválido.");
        }
    }

    }




