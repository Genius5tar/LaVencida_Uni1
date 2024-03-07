/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package co.edu.udc.lavencida_uni1;

import java.util.Scanner;

/**
 *
 * @author PEDRO DE HORTA
 */
public class LaVencida_Pto1 {

    public static void main(String[] args) {
        int i = 0;

        // Creamos un arreglo de objetos Frito
        Frito[] fritos = new Frito[5];
        // Llenar el arreglo con objetos Frito
        fritos[0] = new Frito("Arepa", "Pollo");
        fritos[1] = new Frito("Faluta", "Jamon");
        fritos[2] = new Frito("Dedito", "Queso");
        fritos[3] = new Frito("papa", "Huevo");
        fritos[4] = new Frito("Dedito", "Queso");
        // Acceder a los elementos del arreglo
        do {
            Frito frito = fritos[i];
            System.out.println("Nombre: " + frito.getNombre() + ", Contenido: " + frito.getContenido());
            i++;
        } while (i < fritos.length);

        System.out.println("\n--------------------------------------------------");
        byte[] aBytes = new byte[5];
        aBytes[0] = 3;
        aBytes[1] = 5;
        aBytes[2] = 9;
        aBytes[3] = 6;
        aBytes[4] = 2;

        System.out.println("este es Arreglo Byte de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aBytes[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        char[] aCaract = new char[5];
        aCaract[0] = 'a';
        aCaract[1] = 'r';
        aCaract[2] = 'r';
        aCaract[3] = 'a';
        aCaract[4] = 'y';
        System.out.println("este es Arreglo Char de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aCaract[i] + ", ");
        }
            
    System.out.println("\n--------------------------------------------------");
        int[] aEnteros = new int[5];
        aEnteros[0] = 18;
        aEnteros[1] = 12;
        aEnteros[2] = 20;
        aEnteros[3] = 02;
        aEnteros[4] = 21;

        System.out.println("este es Arreglo Enteros de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aEnteros[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        short[] aCortos = new short[5];
        aCortos[0] = -32768;
        aCortos[1] = 32767;
        aCortos[2] = 32767;
        aCortos[3] = -3596;
        aCortos[4] = -5585;

        System.out.println("este es Arreglo Short de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aCortos[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        long[] aLargos = new long[5];
        aLargos[0] = -1555582668;
        aLargos[1] = 9223372;
        aLargos[2] = 5585;
        aLargos[3] = 825;
        aLargos[4] = 999999999;

        System.out.println("este es Arreglo long de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aLargos[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        float[] aFlot = new float[5];
        aFlot[0] = 1.999f;
        aFlot[1] = 3.1f;
        aFlot[2] = -8.9f;
        aFlot[3] = 3.1416f;
        aFlot[4] = -2.95f;

        System.out.println("este es Arreglo Float de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aFlot[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        double[] aDobles = new double[5];
        aDobles[0] = 1888.999;
        aDobles[1] = 35855.1;
        aDobles[2] = 3333.9;
        aDobles[3] = 8555.1416;
        aDobles[4] = 1999.95;

        System.out.println("este es Arreglo Double de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aDobles[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        boolean[] aBool = new boolean[5];
        aBool[0] = true;
        aBool[1] = false;
        aBool[2] = false;
        aBool[3] = true;
        aBool[4] = false;

        System.out.println("este es Arreglo Booleanos de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aBool[i] + ", ");
        }
        
    System.out.println("\n--------------------------------------------------");
        String[] aStrings = new String[5];
        aStrings[0] = "Hola";
        aStrings[1] = "Soy";
        aStrings[2] = "PEDRO";
        aStrings[3] = "DE_HORTA";
        aStrings[4] = "DORIA";

        System.out.println("este es Arreglo Cadenas de 5 elementos");
        for (i = 0; i < 5; i++) {
            System.out.print(aStrings[i] + ", ");
            
        }
    
    System.out.println("\n--------------------------------------------------");
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        System.out.println("este es Arreglo Cadenas de 5 elementos");
        for (String tipos : dataStructs) {
            System.out.println(tipos);
        }

    System.out.println("\n--------------------------------------------------");
        Scanner leer=new Scanner(System.in);
        String[] caracteristicas = new String[5];

        // No declaramos la variable i ya que esta al comienzo del codigo.
        for(i = 0; i < 5; i++){
            System.out.println("Ingrese características para: " + dataStructs[i]);
            caracteristicas[i] = leer.nextLine();
        }
        System.out.println("\n---------------Características----------------");
        for(i = 0; i < 5; i++){
            System.out.println("Características de " + dataStructs[i] + ": " + caracteristicas[i]);         
        }
        
    System.out.println("\n---------------Fin del punto 1 -------------------");
        //Inicializamos la variable scanner para poder usar el tecaldo
        Scanner scanner = new Scanner(System.in);
        //creacion de variable de tipo entero para la tecl 2
        int tecla;
        //vamos a crear un bucle do while y una condicion inverida para ejecutar una validacion de que latecla ingresada sea igual al numero entero 2
        do {
            System.out.println("¡Introduce el número 2 para continuar!"); 
            //a la espera de que se presione la tecla 2
            tecla = scanner.nextInt();
            //condicion que valida si la tecla capturada y almacenada en la variable (tecla) de tipo int es distinta a 2 
            if (tecla != 2) {
                //si se cumple esta volvera a solicitar el igreso de la misma
                System.out.println("Por favor, presiona la tecla 2 para iniciar LaVencida_Pto2...");
            }
        } while (tecla != 2);
        //una ves validado que si se cumplio con la condicion se para el bucle y se continua a ejecutar la sigiente java class

        LaVencida_Pto2_3.main(args);
    }
    
}
