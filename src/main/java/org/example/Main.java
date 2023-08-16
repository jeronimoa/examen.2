package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Bienvenido al sistema de nóminas");
            System.out.println("1. Calcular Salario");
            System.out.println("2. Pagar Nómina");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    calcularSalario(teclado);
                    break;
                case 2:
                    pagarNomina(teclado);
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el sistema de nóminas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        }

        teclado.close();
    }

    private static void calcularSalario(Scanner scanner) {
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salario = horasTrabajadas * tarifaPorHora;
        System.out.println("El salario del empleado es: $" + salario);
    }

    private static void pagarNomina(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.next();
        System.out.print("Ingrese el salario a pagar: ");
        double salarioAPagar = scanner.nextDouble();

        double deduccionSeguridadSocial = salarioAPagar * 0.08;
        double salarioFinal = salarioAPagar - deduccionSeguridadSocial;

        System.out.println("Se ha realizado el pago de nómina a " + nombreEmpleado + " por un valor de $" + salarioFinal + " se le ha rebajado el 8% por seguridad social" );
    }

}