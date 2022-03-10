package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;

import java.util.*;

public interface PeliculaIRepository {
    public List<Map<String, Object>> MostrarRegistro();
    public int GuardarRegistro(Pelicula pelicula);
    int EditarRegistro(Pelicula pelicula);
    public int EliminarRegistro(int id);
}
