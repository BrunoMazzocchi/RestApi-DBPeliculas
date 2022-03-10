package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;

import java.util.*;

public interface GeneroIRepository {
    public List<Map<String, Object>> MostrarRegistro();
    public int GuardarRegistro(Genero genero);
    int EditarRegistro(Genero genero);
    public int EliminarRegistro(int id);
}

