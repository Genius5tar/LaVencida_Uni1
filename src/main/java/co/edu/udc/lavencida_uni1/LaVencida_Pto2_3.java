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

public class LaVencida_Pto2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int cantidadVentas = rand.nextInt(15) + 1; // generamos un numero aleatorio entre 1 y 15 para determianr la cantidad de elementos
        int[] ventas = new int[cantidadVentas];

        //llenamos el arreglo "ventas" con valores aleatorios entre 1 y 1000
        for (int i = 0; i < cantidadVentas; i++) {
            ventas[i] = rand.nextInt(1000) + 1;
        }

        //Cantidad de ventas
        System.out.println("\n-----------------Bienvenido al Punto 2-------------------");
        System.out.println("Cantidad de ventas: " + cantidadVentas);

        //Cada una de las ventas
        System.out.println("Valor de cada venta:");
        for (int i = 0; i < cantidadVentas; i++) {
            System.out.println("Venta " + (i + 1) + ": " + ventas[i]);
        }

        //Total de ventas
        int totalVentas = 0;
        for (int venta : ventas) {
            totalVentas += venta;
        }
        System.out.println("Total de ventas: " + totalVentas);

        //Promedio de las ventas
        double promedioVentas = (double) totalVentas / cantidadVentas;
        System.out.println("Promedio de ventas: " + promedioVentas);

        do {
            System.out.println("\n---------------Que funcion desea ejecutar?-------------------");
            System.out.println("Buscar la venta más alta: a");
            System.out.println("Buscar la venta más Baja: b");
            System.out.println("Sumar el total de ventas: c");
            System.out.println("Calcular el Promedio de ventas : d");
            System.out.println("Valor Mas cerca del Promedio: e");
            System.out.println("Anterior Punto: 1");
            System.out.println("Siguiente Punto: 4");
            System.out.println("\n------------Introdusca la Tecla que corresponde---------------");

            String opcion = scanner.nextLine();
            /* usamos un switch para evaluar que tecla se introdujo con el teclado 
            de esta manera llamamos a las funcion correspondiente
            a cada funcion le pasamos como parametros el array ventas 
            el cual contine los elementos que usara cada funcion*/
            switch (opcion) {
                case "a":
                    buscarVentaMasAlta(ventas);
                    break;
                case "b":
                    buscarVentaMasBaja(ventas);
                    break;
                case "c":
                    sumarTotalVentas(ventas);
                    break;
                case "d":
                    calcularPromedioVentas(ventas, cantidadVentas);
                    break;
                case "e":
                    valorMasCercaDelPromedio(ventas, promedioVentas);
                    break;
                case "1":
                    LaVencida_Pto1.main(args);
                    return;
                case "4":
                    LaVencida_Pto4.main(args, ventas);
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true);
    }

    /* En estas dos primeras funciones lo que ahcemos es recorrere el array 
    remplazando el valor de la variable con el valor mayor o menor que va 
    encontrando al momento de ejcutar el for*/
    public static void buscarVentaMasAlta(int[] ventas) {
        // Inicializamos la variable para almacenar la venta más alta
        int ventaMasAlta = ventas[0]; // Suponemos que la primera venta es la más alta

        // Bucle para encontrar la venta más alta, recorremos el array buscando la de mayor valor
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventaMasAlta) {
                ventaMasAlta = ventas[i];
            }
        }

        System.out.println("Ejecutando...");
        System.out.println("La venta más alta es: " + ventaMasAlta);
    }

    public static void buscarVentaMasBaja(int[] ventas) {
        // Inicializamos la variable para almacenar la venta menor valor
        int ventaMasBaja = ventas[0]; // Suponemos como referencia que la primera venta es la más baja

        // Bucle para encontrar la venta de menor valor 
        for (int i = 1; i > ventas.length; i++) {
            if (ventas[i] < ventaMasBaja) {
                ventaMasBaja = ventas[i];
            }
        }

        System.out.println("Ejecutando...");
        System.out.println("La venta más Baja es: " + ventaMasBaja);
    }

    /*
    en estas dos funciones es cuestion de recorrer el array con un bucle
    y el valro de cada elemento es sumado incrementamente a una variable 
    obetniendo el valor de la suma de cada elemnto y apliando operacioens basicas
     */
    public static void sumarTotalVentas(int[] ventas) {
        // Inicializamos la variable para almacenar la sumatoria de los valores
        int totalVentas = 0;
        //recorremos el array y vamos sumando cada elemento a la variable
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        //imprimimos en pantalla el resultado de la suma
        System.out.println("Ejecutando...");
        System.out.println("El total de la ventas es: " + totalVentas);
    }

    /*al igual que la anteriro funcion solo que esta ves aplicaremos formula de 
    promedio que es suma de todos los elementos dividio entre el numero total de
    elemtos obteniendo una variable de tipo bouble
     */
    public static void calcularPromedioVentas(int[] ventas, int cantidadVentas) {
        // Inicializamos la variable para almacenar la suma de ventas
        int totalVentas = 0;
        double promVentas;
        // Sumamos todas las ventas
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }

        // Calculamos el promedio de ventas
        promVentas = (double) totalVentas / cantidadVentas;

        // Imprimimos el resultado
        System.out.println("Promedio de ventas: " + promVentas);
    }

    public static void valorMasCercaDelPromedio(int[] ventas, double promedioVentas) {
        //Se nos pide que la función debe buscar la venta más cercana al valor que sigue al promedio, 
        //se da por entendido que dicho valor puede ser puede ser >= o <= quel promedio.
        
        // Inicializamos las variables para almacenar la venta más cercana y su diferencia absoluta mínima
        int ventaMasCercana = ventas[0]; // Suponemos que la primera venta es la más cercana inicialmente
        double diferenciaMinima = Math.abs(ventaMasCercana - promedioVentas); // Diferencia absoluta mínima inicialmente

        // Buscamos la venta más cercana al promedio
        for (int venta : ventas) {
            double diferencia = Math.abs(venta - promedioVentas); // Calculamos la diferencia absoluta entre la venta y el promedio
            if (diferencia < diferenciaMinima) { // Si la diferencia es menor que la diferencia mínima actual
                ventaMasCercana = venta; // Actualizamos la venta más cercana
                diferenciaMinima = diferencia; // Actualizamos la diferencia mínima
            }
        }
        
        /*es decir recorremoes el arreglo dato por dato y a dicho valor le restamos el promedio
        dicho resultado lo obtenemos en su valor abosoluto es decir siempre(+), y se guarda en una variable 
        de esta forma al momento de hacer el recorrido, se deja una referencia inicial diferenciaMinima
        se va actualizando dicha varaible segun el valor que se va obteniendo en cada iteracion de elementos
        si es menor dicha diferencia lo almacenamos en la variable "diferenciaMinima" si no se deja igual 
        por lo que al final obtendremos la venta o el elmento del array que mas se acerca al promedio
        */
        // Imprimimos la venta más cercana al promedio
        System.out.println("Venta más cercana al promedio: " + ventaMasCercana);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
