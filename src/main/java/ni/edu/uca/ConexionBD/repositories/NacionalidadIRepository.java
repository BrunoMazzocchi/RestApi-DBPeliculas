package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;

import java.util.*;

public interface NacionalidadIRepository {
    public List<Map<String, Object>> MostrarRegistro();
    public int GuardarRegistro(Nacionalidad nacionalidad);
    int EditarRegistro(Nacionalidad nacionalidad);
    public int EliminarRegistro(int id);
}
