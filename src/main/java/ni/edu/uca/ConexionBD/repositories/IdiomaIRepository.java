package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;

import java.util.*;

public interface IdiomaIRepository {
    public List<Map<String, Object>> MostrarRegistro();
    public int GuardarRegistro(Idioma idioma);
    int EditarRegistro(Idioma idioma);
    public int EliminarRegistro(int id);
}
