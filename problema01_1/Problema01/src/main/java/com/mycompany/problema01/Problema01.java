
package com.mycompany.problema01;

import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, resultado = 0;
        int opcion;
        String operacion = "";

        System.out.println("OPERACIONES ARITMETICAS");
        System.out.println("========================");

        System.out.print("Ingrese el primer numero: ");
        numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada.nextDouble();

        System.out.println("\nSeleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");

        System.out.print("Seleccione una opcion: ");
        opcion = entrada.nextInt();

        if (numero1 > numero2) {

            if (opcion == 1) {
                operacion = "Suma";
                resultado = numero1 + numero2;

            } else if (opcion == 2) {
                operacion = "Resta";
                resultado = numero1 - numero2;

            } else if (opcion == 3) {
                operacion = "Multiplicacion";
                resultado = numero1 * numero2;

            } else if (opcion == 4) {

                operacion = "Division";

                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("\nNo se puede dividir para cero.");
                    entrada.close();
                    return;
                }

            } else if (opcion == 5) {

                operacion = "Modulo";

                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                } else {
                    System.out.println("\nNo se puede calcular el modulo con cero.");
                    entrada.close();
                    return;
                }

            } else if (opcion == 6) {
                operacion = "Potencia";
                resultado = Math.pow(numero1, numero2);

            } else {
                System.out.println("\nLa opcion seleccionada no es valida.");
                entrada.close();
                return;
            }

            System.out.println("\nOPERACIONES ARITMETICAS");
            System.out.println("========================");
            System.out.println("Primer numero: " + numero1);
            System.out.println("Segundo numero: " + numero2);
            System.out.println("Operacion seleccionada: " + operacion);
            System.out.println("\nResultado: " + resultado);

        } else {
            System.out.println("\nNo es posible realizar la operacion.");
            System.out.println("El primer numero debe ser mayor que el segundo.");
        }

        entrada.close();
    }
}
