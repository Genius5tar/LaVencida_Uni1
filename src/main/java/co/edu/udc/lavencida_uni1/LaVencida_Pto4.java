/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.lavencida_uni1;

/**
 *
 * @author PEDRO DE HORTA
 */
import java.util.Random;
import java.util.Scanner;

public class LaVencida_Pto4 {

    public static void main(String[] args, int[] ventas) {
        //iniciamos la variable scanner pra rpoder usar sus metodos
        Scanner scanner = new Scanner(System.in);
        //un pequeño menu para la ejecucion de metodos 
        System.out.println("\n-----------------Bienvenido al Punto 2-------------------");
        do {
            System.out.println("\n---------------Que funcion desea ejecutar?-------------------");
            System.out.println("Ordenar las ventas Desc: a");
            System.out.println("Ordenar las ventas Asc: b");
            System.out.println("Ordenar las ventas Ramdom: c");
            System.out.println("Ordenar las ventas par/impar : d");
            System.out.println("Anterior Punto: 3");
            System.out.println("Siguiente Punto: 5");
            System.out.println("\n------------Introdusca la Tecla que corresponde---------------");
            //capturamos por teclado lo introduccido
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    ordenarVentasDesc(ventas);
                    break;
                case "b":
                    ordenarVentasAsc(ventas);
                    break;
                case "c":
                    ordenarVentasRandom(ventas);
                    break;
                case "d":
                    ordenarVentasParImpar(ventas);
                    break;
                case "3":
                    LaVencida_Pto2_3.main(args);
                    break;
                case "5":
                    LaVencida_Pto5.main(args);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true);
    }

    public static void ordenarVentasDesc(int[] ventas) {
        // usamos del algoritmo de ordenamiento de burbuja para ordenar las ventas de forma descendente >
        int n = ventas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ventas[j] < ventas[j + 1]) {
                    // Intercambiar los elementos si el elemento actual es menor que el siguiente
                    int temp = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = temp;
                }
            }
        }
        System.out.println("Nuevo Orden...");
        for (int i = 0; i < ventas.length; i++) {
            int venta = ventas[i];
            System.out.println("Venta Desc " + (i + 1) + ": " + venta);
        }

    }

    public static void ordenarVentasAsc(int[] ventas) {
    int n = ventas.length;
    
    // Algoritmo de ordenamiento de burbuja para ordenar las ventas de forma ascendente
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (ventas[j] > ventas[j + 1]) {
                // Intercambiar los elementos si el elemento actual es mayor que el siguiente
                int temp = ventas[j];
                ventas[j] = ventas[j + 1];
                ventas[j + 1] = temp;
            }
        }
    }
    
    // Imprimir las ventas ordenadas de forma ascendente
    System.out.println("Nuevo Orden...");
    for (int i = 0; i < n; i++) {
        System.out.println("Venta Asc" + (i + 1) + ": " + ventas[i]);
    }
}

    public static void ordenarVentasRandom(int[] ventas) {
    Random rand = new Random();

    // Recorremos el arreglo de ventas
    for (int i = 0; i < ventas.length; i++) {
        // Generamos un índice aleatorio dentro del rango del arreglo
        int randomIndex = rand.nextInt(ventas.length);

        // Intercambiamos el elemento actual con el elemento en el índice aleatorio
        int temp = ventas[i];
        ventas[i] = ventas[randomIndex];
        ventas[randomIndex] = temp;
    }

    // Imprimimos las ventas ordenadas de forma aleatoria
    System.out.println("Nuevo Orden...");
    for (int i = 0; i < ventas.length; i++) {
        System.out.println("Venta Rmd" + (i + 1) + ": " + ventas[i]);
    }
}

    public static void ordenarVentasParImpar(int[] ventas) {
    // Creamos dos arreglos para almacenar números pares e impares
    int[] pares = new int[ventas.length];
    int[] impares = new int[ventas.length];

    // Contadores para mantener el seguimiento de la cantidad de pares e impares
    int countPares = 0;
    int countImpares = 0;

    // Separamos los números pares e impares en los arreglos correspondientes
    for (int venta : ventas) {
        if (venta % 2 == 0) { // Si es par es multiplo de 2
            pares[countPares++] = venta;
        } else { // Si es impar lo contrario a la condicion anterior
            impares[countImpares++] = venta;
        }
    }

    // Copiamos los elementos de los arreglos de pares e impares de vuelta al arreglo original
    for (int i = 0; i < countPares; i++) {
        ventas[i] = pares[i];
    }
    for (int i = 0; i < countImpares; i++) {
        ventas[countPares + i] = impares[i];
    }
    
    // Imprimimos las ventas ordenadas de forma aleatoria
    System.out.println("Nuevo Orden...");
    for (int i = 0; i < ventas.length; i++) {
        System.out.println("Venta Par/Impar" + (i + 1) + ": " + ventas[i]);
    }
}

}
