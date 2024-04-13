import java.util.Scanner;

public class BankOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String clientName = "Tony Stark";
        String accountType = "Corriente";
        double balance = 1599.99;
        int option = 0;

        System.out.println("********************************************\n");
        System.out.println(String.format("Nombre del cliente: %s", clientName));
        System.out.println(String.format("Tipo de cuenta: %s", accountType));
        System.out.println(String.format("Saldo disponible: %, .2f$\n", balance));
        System.out.println("********************************************");

        while (option != 9) {
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            option = input.nextInt();

            if (option == 1) {
                System.out.println(String.format("El saldo actualizado es: %, .2f $", balance));
            } else if (option == 2) {
                double value = 0;
                System.out.println("¿Cuál es el valor que desea retirar?");
                value = input.nextDouble();
                if (value <= balance) {
                    balance -= value;
                    System.out.println(String.format("Saldo restante: %, .2f $", balance));
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else if (option == 3) {
                double value = 0;
                System.out.println("¿Cuál es el valor que desea depositar?");
                value = input.nextDouble();
                if (value > 0) {
                    balance += value;
                    System.out.println(String.format("El saldo actualizado es: %, .2f $", balance));
                } else {
                    System.out.println("Monto invalido");
                }
            }
        }
    }
}
