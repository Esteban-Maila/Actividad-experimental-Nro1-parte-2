/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
import java.util.ArrayList;

public class GestorDeProyecto {
    private ArrayList<Proyecto> proyectos;

    public GestorDeProyecto() {
        this.proyectos = new ArrayList<>();
    }

    public Proyecto registrarProyecto(String nombre, String descripcion) {
        Proyecto proyecto = new Proyecto(nombre, descripcion);
        proyectos.add(proyecto);
        return proyecto;
    }

    public void mostrarProyectos() {
        for (Proyecto proyecto : proyectos) {
            proyecto.mostrarEstado();
        }
    }
}



