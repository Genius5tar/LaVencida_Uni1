/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.lavencida_uni1;

import java.util.Scanner;

/**
 *
 * @author PEDRO DE HORTA
 */
public class LaVencida_Pto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------Bienvenido al Punto 5-------------------");
        //creamos la matriz (bidimencional) y le asignamos el tamaño
        String[][] lenguajes = new String[8][5];
        //llenamos la primea fila como di fueran encabezados fijos de una tabla
        lenguajes[0][0] = "NOMBRE";
        lenguajes[0][1] = "AÑO";
        lenguajes[0][2] = "AUTOR";
        lenguajes[0][3] = "DETALLES";
        lenguajes[0][4] = "FRAMEWORKS";

        //Un pequeño Menu para ejecutar las funciones
        do {
            System.out.println("---------------Que funcion desea ejecutar?-------------------");
            System.out.println("llenar informacion: c");
            System.out.println("Find Lang por nombre: d");
            System.out.println("Find coordenadas de Lang por nombre: e");
            System.out.println("Consultar una fila por su indice: f");
            System.out.println("Consultar una columna por su indice: g");
            System.out.println("Consultar valores por cordenadas (X & Y): h");
            System.out.println("Mostrar Matriz con columas especificas : i");

            System.out.println("\n------------Introdusca la Tecla que corresponde---------------");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "c":
                    infoLenguajes();
                    break;
                case "d":
                    FindForName();
                    break;
                case "e":
                    FindCoordsForName();
                    break;
                case "f":
                    ConsultRowForIndex();
                    break;
                case "g":
                    ConsultColumnForIndex();
                    break;
                case "h":
                    ConsultValuesForCoords();
                    break;
                case "i":
                    System.out.println("porfavor ingrese en true las columna que quiere ver ejem:");
                    System.out.println("[NOMBRE,  AÑO,   AUTOR,  DETALLES, FRAMEWORKS].");
                    System.out.println("  true,  false,  true,     true,     false");
                    String hidecolums = scanner.nextLine();

                    boolean[] Columns = new boolean[5];
                    Columns[0] = true;
                    Columns[1] = false;
                    Columns[2] = true;
                    Columns[3] = true;
                    Columns[4] = false;

                    HideOrViewColumns(Columns);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (true); // El bucle se ejecutará indefinidamente hasta que el programa se detenga manualmente
    }

    public static void infoLenguajes() {

    }

    public static void FindForName() {

    }

    public static void FindCoordsForName() {

    }

    public static void ConsultRowForIndex() {

    }

    public static void ConsultColumnForIndex() {

    }

    public static void ConsultValuesForCoords() {

    }

    public static void HideOrViewColumns(boolean[] Columns) {

    }

}
