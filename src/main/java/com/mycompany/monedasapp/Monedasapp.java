package com.mycompany.monedasapp;

import java.util.Scanner;

public class Monedasapp {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            opcion = menu(scanner);
            
            switch (opcion) {
                case 1:
                    realizarConversion(scanner, conversor, "USD", "ARS");
                    break;
                case 2:
                    realizarConversion(scanner, conversor, "ARS", "USD");
                    break;
                case 3:
                    realizarConversion(scanner, conversor, "USD", "BRL");
                    break;
                case 4:
                    realizarConversion(scanner, conversor, "BRL", "USD");
                    break;
                case 5:
                    realizarConversion(scanner, conversor, "USD", "COP");
                    break;
                case 6:
                    realizarConversion(scanner, conversor, "COP", "USD");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
        
    }

    public static int menu(Scanner scanner) {
        System.out.println("================== MENU ==================");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.println("Elija una opción válida: ");
        System.out.println("**********************************");
        
        return scanner.nextInt();
    }
    
    private static void realizarConversion(Scanner scanner, Conversor conversor, String monedaInicial, String monedaConvertida) {
        System.out.print("Ingrese el monto: ");
        int monto = scanner.nextInt();
        var resultado = conversor.convertir(monedaInicial, monedaConvertida, monto);
        System.out.println("Resultado de la conversión: " + resultado.conversion_result());
    }
}
