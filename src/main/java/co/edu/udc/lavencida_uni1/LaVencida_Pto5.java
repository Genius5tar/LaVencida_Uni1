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
        //iniciamos la variable scanner pra rpoder usar sus metodos
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------Bienvenido al Punto 5-------------------");
        //creamos la matriz (bidimencional) y le asignamos el tamaño
        /*Object[][] lenguajes = new Object[3][5];
        //llenamos por default  la primea fila como si fueran encabezados fijos de una tabla
        lenguajes[0][0] = "NOMBRE";
        lenguajes[0][1] = "ANIO";
        lenguajes[0][2] = "AUTOR";
        lenguajes[0][3] = "DETALLES";
        lenguajes[0][4] = "FRAMEWORKS";
         */

        //para pruebas defini una matris con valores
        Object[][] lenguajes = {
            {"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"},
            {"Java", "1995", "James Gosling", "Lenguaje de programación multipropósito", "Spring, Hibernate"},
            {"Python", "1991", "Guido van Rossum", "Lenguaje de programación interpretado", "Django, Flask"},
            {"JavaScript", "1995", "Brendan Eich", "Lenguaje de programación interpretado", "React, Angular, Vue.js"}
        // Puedes agregar más filas según sea necesario
        };

        //Un pequeño Menu para ejecutar las funciones
        do {
            System.out.println("---------------Que funcion desea ejecutar?-------------------");
            System.out.println("llenar informacion: c");
            System.out.println("Comprobar Existencia de Lang por nombre: d");
            System.out.println("Find coordenadas de Lang por nombre: e");
            System.out.println("Consultar una fila por su indice: f");
            System.out.println("Consultar una columna por su indice: g");
            System.out.println("Consultar valores por cordenadas (X & Y): h");
            System.out.println("Mostrar Matriz con columas especificas : i");

            System.out.println("\n------------Introdusca la Tecla que corresponde---------------");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "c":
                    infoLenguajes(lenguajes);
                    break;
                case "d":
                    FindForName(lenguajes);
                    break;
                case "e":
                    FindCoordsForName(lenguajes);
                    break;
                case "f":
                    try {
                    String[] datos = ConsultRowForIndex(lenguajes);
                    if (datos != null) {
                        System.out.println("Datos de la fila:");
                        for (String dato : datos) {
                            System.out.println(dato);
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
                case "g":
                    try {
                    String[] datos = ConsultColumnForIndex(lenguajes);
                    if (datos != null) {
                        System.out.println("Datos de la columna:");
                        for (String dato : datos) {
                            System.out.println(dato);
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
                case "h":
                    ConsultValuesForCoords(lenguajes);
                    break;
                case "i":
                    System.out.println("Porfavor ingrese en true las columna que quiere ver ejem:");
                    System.out.println("[NOMBRE ANIO AUTOR DETALLES FRAMEWORKS].");
                    System.out.println("     (true false true true false)      ");
                    String hidecolums = scanner.nextLine();

                    boolean[] Columns = new boolean[5];

                    // Validar la cantidad de valores
                    if (hidecolums.split(" ").length != Columns.length) {
                        System.out.println("Error: La cantidad de valores no coincide con la cantidad de columnas.");
                        System.out.println("Intentelo de nuevo.");
                        break;
                    }

                    // Convertir la entrada a un array de booleanos
                    String[] columnValues = hidecolums.split(" ");
                    for (int i = 0; i < columnValues.length; i++) {
                        Columns[i] = Boolean.parseBoolean(columnValues[i]);
                    }

                    HideOrViewColumns(Columns, lenguajes);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (true); // El bucle se ejecutará indefinidamente hasta que el programa se detenga manualmente
    }

    public static void infoLenguajes(Object[][] lenguajes) {
        //iniciamos la variable scanner pra rpoder usar sus metodos
        Scanner scanner = new Scanner(System.in);

        //vamos a recorrer cada una de las filas de la matriz desde la segunda fila lenguajes[1][0]
        //(i=1) asi hasta la ultima fila es decir el tamaño de la matriz (i < matriz.length)
        for (int i = 1; i < lenguajes.length; i++) {
            System.out.println("Ingrese los datos para el lenguaje " + i + ":");

            // Pedir al usuario los datos para cada columna de la fila que se esta 
            //recorriendo en el ciclo anterior, por lo que si no se finaliza este
            //for, el anteriror no podra terminar 
            for (int j = 0; j < lenguajes[i].length; j++) {
                //con este for vamos a recorrer lacolumnas y las vamos a llenar pro teclado
                System.out.print("Ingrese el valor para " + lenguajes[0][j] + ": ");
                lenguajes[i][j] = scanner.nextLine();
            }
            //de esta forma llenamos todas las columnas, cuando se finalce 
            //las 5 coumnas, se detiene el for y continua el for padre con
            //la sigueinte fila.
        }

    }

    public static void FindForName(Object[][] lenguajes) {
        //iniciamos la variable scanner para poder usar sus metodos
        Scanner scanner = new Scanner(System.in);

        //pedimos y guardamos el valor que se esta buscando en la matriz, para el caso es
        //el npmbre del lenguaje o la columna y posicion lenguajes[1][0]
        System.out.println("Para validar existencia ingresa el Nombre del lenguaje: ");
        String NameLang = scanner.nextLine();

        //Para efectos de filtro dentro de la busqueda vamos a especificar
        //la Columna en la que se desea buscar para nuestro caso lenguajes[0][0] = "NOMBRE";)
        int columna = 0;
        //iniciamos la variable donde se almacera el booleano de existencia
        boolean existencia = false;

        //iteramos los valores de la columa NOMBRES desde la segunda fila i = 1
        //hasta el final de la columna de la ultima fila 
        for (int i = 1; i < lenguajes.length; i++) {
            if (lenguajes[i][columna] != null && lenguajes[i][columna].equals(NameLang)) {
                existencia = true;
                break; // Si encontramos el valor, no necesitamos seguir buscando
            }
        }

        //validamos y moastramos en pantalla la existencia del nombre en la matriz
        if (existencia) {
            System.out.println("La existencia de '" + NameLang + "' es: Verdadera");
        } else {
            System.out.println("La existencia de '" + NameLang + "' es: Falso");
        }

    }

    public static int[] FindCoordsForName(Object[][] lenguajes) {
        //usamso estructura de busqueda del punto anteriror 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del lenguaje que desea buscar:");
        String NameLang = scanner.nextLine();

        //creamos un array tipo int para guardar las coordenadas de fila y columna
        int[] coordenadas = new int[2];

        //Columna específica en la que deseas buscar (lenguajes[0][0] = "NOMBRE")
        int columna = 0;

        boolean encontrado = false;

        // Realizar la búsqueda en la columna específicada
        for (int i = 1; i < lenguajes.length; i++) {
            if (lenguajes[i][columna] != null && lenguajes[i][columna].equals(NameLang)) {
                encontrado = true;
                coordenadas[0] = i; // Fila donde se encontró el valor
                coordenadas[1] = columna; // Columna donde se encontró el valor
                break; // Si encontramos el valor, no necesitamos seguir buscando
            }
        }

        // Imprimir el resultado
        if (encontrado) {
            System.out.println("El valor '" + NameLang + "' se encuentra en la fila " + coordenadas[0]
                    + " y columna " + coordenadas[1]);
        } else {
            System.out.println("El valor '" + NameLang + "' no se encuentra en la matriz.");
            return null; // Si no se encuentra, devolvemos null
        }

        return coordenadas;
    }

    public static String[] ConsultRowForIndex(Object[][] lenguajes) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el índice de la fila
        System.out.println("Ingrese el índice de la fila que desea consultar:");
        int FilaIndex = scanner.nextInt();

        // Verificar si la fila existe en la matriz
        if (FilaIndex < 0 || FilaIndex >= lenguajes.length) {
            throw new IllegalArgumentException("La fila especificada no existe en la matriz.");
        }

        //Almacenamos en un array los datos de la fila
        String[] datosFila = new String[lenguajes.length];

        //Iterar sobre los datos de la fila ingresada y almacenarlos en el array
        for (int i = 0; i < lenguajes.length; i++) {
            datosFila[i] = (String) lenguajes[FilaIndex][i];
        }

        return datosFila;
    }

    public static String[] ConsultColumnForIndex(Object[][] lenguajes) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el índice de la columna
        System.out.println("Ingrese el índice de la columna que desea consultar:");
        int columnaIndex = scanner.nextInt();

        // Verificar si la columna existe en la matriz
        if (columnaIndex < 0 || columnaIndex >= lenguajes[0].length) {
            throw new IllegalArgumentException("La columna especificada no existe en la matriz.");
        }

        //Almacenamos en un array los datos de la columna
        String[] datosColumna = new String[lenguajes.length];

        //Iterar sobre los datos de la columna ingresada y almacenarlos en el array
        for (int i = 0; i < lenguajes.length; i++) {
            datosColumna[i] = (String) lenguajes[i][columnaIndex];
        }

        return datosColumna;
    }

    public static void ConsultValuesForCoords(Object[][] lenguajes) {
        Scanner scanner = new Scanner(System.in);

        //insertamos por teclado las coordenadas 
        System.out.println("Ingrese las coordenadas de fila y columna separadas por espacio:");
        int fila = scanner.nextInt(); //almacenamos la fila
        int columna = scanner.nextInt(); //almacenamos la columna

        //validamos que esten dentro del tamaño de la matriz las coordenadas suministradas
        if (fila < 0 || fila >= lenguajes.length || columna < 0 || columna >= lenguajes[0].length) {
            //si se supera el limite del tamaño de la matriz entonces imprimimos error
            //y damos un return para finalizar la funcion
            System.out.println("Las coordenadas ingresadas están fuera de los límites de la matriz.");
            return; //matamos la función ya que no podemos obtener el valor
        }

        //sacamos el valor en las coordenadas especificadas
        Object valor = lenguajes[fila][columna]; //accedemos a la matriz usando las coordenadas

        //mostramos en pantalla el valor
        System.out.println("El valor (" + valor + "). Esta en las coordenadas (" + fila + ", " + columna + ")");
    }

    public static void HideOrViewColumns(boolean[] Columns, Object[][] lenguajes) {
        //verificamos que la cantidad de valores del arreglo de booleanos 
        //no supere a la cantidad de columnas de la matriz
        if (Columns.length != lenguajes[0].length) {
            //si esto se cumple entonces mandamos error en consola
            System.out.println("Error: La cantidad de valores en el array de booleanos no coincide con la cantidad de columnas en la matriz.");
            return;
        }

        //Iterar sobre cada columna en la matriz lenguajes
        for (int i = 0; i < lenguajes[0].length; i++) {
            //Si el valor en la posición correspondiente de Columns es true, mostrar la columna
            //Si es false, ocultarla
            if (Columns[i]) {
                //mostrar la columna
                for (int j = 0; j < lenguajes.length; j++) {
                    System.out.print(lenguajes[j][i] + "\t"); 
                // Imprimir el valor de la celda en la columna
                }
                System.out.println(); 
                //ueva línea para la siguiente columna
            }
        }
    }

}
