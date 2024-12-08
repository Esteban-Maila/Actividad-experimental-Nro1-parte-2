/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
public class Main {
    public static void main(String[] args) {
        GestorDeProyecto gestor = new GestorDeProyecto();

        Proyecto proyecto1 = gestor.registrarProyecto("Proyecto 1", "Descripción del proyecto 1");
        proyecto1.agregarTarea(new Tarea("Diseñar la base de datos", "Crear el modelo ER", "Carlos"));
        proyecto1.agregarTarea(new Tarea("Implementar la interfaz", "Crear el diseño inicial", "Ana"));

        Proyecto proyecto2 = gestor.registrarProyecto("Proyecto 2", "Descripción del proyecto 2");
        proyecto2.agregarTarea(new Tarea("Definir requerimientos", "Reunión con el cliente", "Luis"));

        gestor.mostrarProyectos();
    }
}


    

