package com.mycompany.monedasapp;

import java.util.Scanner;

public class Monedasapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0; // Variable para almacenar la opción del usuario

        // Llamamos al menú
        do {
            // Mostrar el menú y leer la opción
            opcion = menu(scanner);
            
            // Procesar la opción
            switch (opcion) {
                case 1:
                    // Aquí podrías agregar la lógica para la opción 1
                    System.out.println("Opción 1 seleccionada: Funcionalidad por definir.");
                    break;
                case 2:
                    // Agrega la lógica para la opción 2
                    System.out.println("Opción 2 seleccionada: Funcionalidad por definir.");
                    break;
                case 3:
                    // Agrega la lógica para la opción 3
                    System.out.println("Opción 3 seleccionada: Funcionalidad por definir.");
                    break;
                case 8:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Si se ingresa una opción no válida
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 8); // El bucle termina cuando se selecciona la opción 8 (salir)

        // Cerramos el scanner al final
        scanner.close();
    }

    public static int menu(Scanner scanner) {
        System.out.println("================== MENU ==================");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
        
        return scanner.nextInt();
    }
}
