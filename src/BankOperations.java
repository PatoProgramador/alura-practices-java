import java.util.Scanner;

public class BankOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String clientName = "Tony Stark";
        String accountType = "Corriente";
        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        double balance = 1599.99;
        int option = 0;

        System.out.println("********************************************\n");
        System.out.println(String.format("Nombre del cliente: %s", clientName));
        System.out.println(String.format("Tipo de cuenta: %s", accountType));
        System.out.println(String.format("Saldo disponible: %, .2f$\n", balance));
        System.out.println("********************************************");

        while (option != 9) {
            System.out.println(menu);
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println(String.format("El saldo actualizado es: %, .2f $", balance));
                    break;
                case 2:
                    double value = 0;
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    value = input.nextDouble();
                    if (value <= balance) {
                        balance -= value;
                        System.out.println(String.format("Saldo restante: %, .2f $", balance));
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    double valueDeposit = 0;
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    valueDeposit = input.nextDouble();
                    if (valueDeposit > 0) {
                        balance += valueDeposit;
                        System.out.println(String.format("El saldo actualizado es: %, .2f $", balance));
                    } else {
                        System.out.println("Monto invalido");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa... gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta con alguna del menu");
                    break;
            }
        }
    }
}
