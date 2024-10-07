package src;


import src.view.EliminarTareaView;
import src.view.NuevatareaView;
import src.view.TareaView;
import src.view.TareasView;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
       NuevatareaView nuevatareaView = new NuevatareaView();
       EliminarTareaView eliminarTareaView = new EliminarTareaView();
       TareaView tareaView = new TareaView();
       TareasView tareasView = new TareasView(new HashMap<>());
    }
}
