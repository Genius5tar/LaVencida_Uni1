/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.lavencida_uni1;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Frito {
    //declaramos el tipo de atributo
        private String nombre;
        private String contenido;

    // Constructor
        public Frito(String nombre, String contenido) {
            this.nombre = nombre;
            this.contenido = contenido;
        }
    //Métodos getter y setter
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getContenido() {
            return contenido;
        }
        public void setContenido(String contenido) {
            this.contenido = contenido;
        }
} 
