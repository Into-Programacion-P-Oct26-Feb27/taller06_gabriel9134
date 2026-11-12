
package com.mycompany.problema02;

import java.util.Scanner;
import java.util.Locale;

public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String propietario;
        String tipoVehiculo = "";
        double avaluo;
        double porcentaje = 0;
        double valorFijo = 0;
        double valorBase;
        double recargo = 0;
        double total;
        int tipo;

        System.out.println("PEAJE BUENA VIA");
        System.out.println("========================");

        System.out.print("Ingrese el nombre del propietario: ");
        propietario = entrada.nextLine();

        System.out.println("\nSeleccione el tipo de vehiculo:");
        System.out.println("1. Vehiculo ligero particular");
        System.out.println("2. Vehiculo grande particular");
        System.out.println("3. Taxi");
        System.out.println("4. Autobus urbano");

        System.out.print("Elija una opcion (1-4): ");
        tipo = entrada.nextInt();

        System.out.print("Ingrese el avaluo del vehiculo: ");
        avaluo = entrada.nextDouble();

        switch (tipo) {

            case 1:
                tipoVehiculo = "Vehiculo ligero particular";
                porcentaje = 0.0001;
                valorFijo = 2.00;
                break;

            case 2:
                tipoVehiculo = "Vehiculo grande particular";
                porcentaje = 0.0002;
                valorFijo = 2.50;
                break;

            case 3:
                tipoVehiculo = "Taxi";
                porcentaje = 0.0004;
                valorFijo = 1.50;
                break;

            case 4:
                tipoVehiculo = "Autobus urbano";
                porcentaje = 0.0005;
                valorFijo = 2.20;
                break;

            default:
                System.out.println("\nTipo de vehiculo no valido.");
                entrada.close();
                return;
        }

        valorBase = (avaluo * porcentaje) + valorFijo;

        if ((tipo == 1 || tipo == 2) && avaluo > 30000) {
            recargo = 1.50;
        } else {
            recargo = 0;
        }

        total = valorBase + recargo;

        System.out.println("\nPEAJE \"BUENA VIA\"");
        System.out.println("========================");
        System.out.println("Propietario: " + propietario);
        System.out.println("Tipo: " + tipoVehiculo);
        System.out.printf("    Avaluo: $%.2f%n", avaluo);
        System.out.printf("    Valor base del peaje: $%.2f%n", valorBase);
        System.out.printf("    Recargo: $%.2f%n", recargo);
        System.out.println();
        System.out.printf("    Total a cancelar: $%.2f%n", total);

        entrada.close();
    }
}
