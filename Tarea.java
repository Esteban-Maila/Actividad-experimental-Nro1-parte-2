/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
public class Tarea {
    private String titulo;
    private String descripcion;
    private String responsable;
    private String estado;

    public Tarea(String titulo, String descripcion, String responsable) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.estado = "Pendiente";
    }

    public void completar() {
        this.estado = "Completada";
    }

    @Override
    public String toString() {
        return "Tarea: " + titulo + ", Responsable: " + responsable + ", Estado: " + estado;
    }
}


