package src.model;

import java.util.HashMap;

    public class Tarea {
        private String titulo;
        private String descripcion;
        private String fecha;
        private String estado;


        public Tarea(String titulo, String descripcion, String fecha, String estado) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.estado = estado;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getFecha() {
            return fecha;
        }

        public String getEstado() {
            return estado;
        }


        public HashMap<String, String> toHashMap() {
            HashMap<String, String> Datatareas = new HashMap<>();
            Datatareas.put("Titulo", this.titulo);
            Datatareas.put("Descripcion", this.descripcion);
            Datatareas.put("Fecha", this.fecha);
            Datatareas.put("Estado", this.estado);
            return Datatareas;
        }
    }

