/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private ArrayList<Tarea> tareas;

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarEstado() {
        System.out.println("Proyecto: " + nombre);
        for (Tarea tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}

