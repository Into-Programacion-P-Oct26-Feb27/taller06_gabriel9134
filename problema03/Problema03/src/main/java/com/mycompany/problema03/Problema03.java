
package com.mycompany.problema03;

import java.util.Scanner;
import java.util.Locale;

public class Problema03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String empleado;
        int tipoEmpleado;
        int aniosServicio;

        double sueldoInicial;
        double porcentaje = 0;
        double incremento;
        double bonificacion = 0;
        double nuevoSueldo;

        System.out.println("REPORTE DE INCREMENTO SALARIAL");
        System.out.println("================================");

        System.out.print("Ingrese el nombre del empleado: ");
        empleado = entrada.nextLine();

        System.out.println("\nSeleccione el tipo de empleado:");
        System.out.println("1. Tipo 1 - Incremento del 5%");
        System.out.println("2. Tipo 2 - Incremento del 7%");
        System.out.println("3. Tipo 3 - Incremento del 9%");
        System.out.println("4. Tipo 4 - Incremento del 12%");
        System.out.println("5. Otro tipo - Incremento del 15%");

        System.out.print("Ingrese el tipo de empleado: ");
        tipoEmpleado = entrada.nextInt();

        System.out.print("Ingrese los anios de servicio: ");
        aniosServicio = entrada.nextInt();

        System.out.print("Ingrese el sueldo inicial: ");
        sueldoInicial = entrada.nextDouble();

        switch (tipoEmpleado) {

            case 1:
                porcentaje = 0.05;
                break;

            case 2:
                porcentaje = 0.07;
                break;

            case 3:
                porcentaje = 0.09;
                break;

            case 4:
                porcentaje = 0.12;
                break;

            default:
                porcentaje = 0.15;
                break;
        }

        if (aniosServicio < 2) {
            bonificacion = 0;

        } else if (aniosServicio < 5) {
            bonificacion = 30;

        } else if (aniosServicio < 10) {
            bonificacion = 60;

        } else {
            bonificacion = 100;
        }

        incremento = sueldoInicial * porcentaje;

        nuevoSueldo = sueldoInicial + incremento + bonificacion;

        System.out.println("\nREPORTE DE INCREMENTO SALARIAL");
        System.out.println("================================");
        System.out.println("Empleado: " + empleado);
        System.out.println("Tipo de empleado: " + tipoEmpleado);
        System.out.println("Anios de servicio: " + aniosServicio);

        System.out.println();
        System.out.printf("Sueldo inicial: $%.2f%n", sueldoInicial);
        System.out.printf("Porcentaje de incremento: %.0f%%%n", porcentaje * 100);
        System.out.printf("Incremento salarial: $%.2f%n", incremento);
        System.out.printf("Bonificacion por antiguedad: $%.2f%n", bonificacion);

        System.out.println();
        System.out.printf("Nuevo sueldo: $%.2f%n", nuevoSueldo);

        entrada.close();
    }
}
