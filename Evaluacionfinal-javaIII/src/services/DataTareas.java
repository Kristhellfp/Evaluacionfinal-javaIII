package src.services;

import src.model.Tarea;

import java.util.ArrayList;

public class DataTareas {

    private ArrayList<Tarea> data;

    public DataTareas() {
        data = new ArrayList<>();

        data.add(new Tarea("Ecuaciones", "Realizar actividad", "10-09-2024", "Completado"));
        data.add(new Tarea("Ética y estética", "Realizar glosario", "15-07-2024", "Sin entregar"));
        data.add(new Tarea("Partes de la oración", "Realizar páginas", "28-09-2024", "Completado"));
        data.add(new Tarea("Proyecto-Hospital", "Compartir repositorio", "11-10-2024", "En progreso"));
        data.add(new Tarea("Arte colonial", "Realización de maqueta", "15-10-2024", "En progreso"));

    }

    public Tarea login(String Titulo, String Descripcion) {
        for (Tarea data : data) {
            if (data.getTitulo().equals(Titulo) && data.getDescripcion().equals(Descripcion)) {
                return data;
            }
        }
        return null;
    }

    public ArrayList<Tarea> getData() {
        return data;
    }
}