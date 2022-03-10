package ni.edu.uca.ConexionBD.services;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class NacionalidadService implements NacionalidadIRepository {

    @Autowired
    NacionalidadDRepository dRNacionalidad;

    @Override
    public List<Map<String, Object>> MostrarRegistro() {
        return dRNacionalidad.MostrarRegistro();
    }

    @Override
    public int GuardarRegistro(Nacionalidad nacionalidad) {
        return dRNacionalidad.GuardarRegistro(nacionalidad);
    }

    @Override
    public int EditarRegistro(Nacionalidad nacionalidad) {
        return dRNacionalidad.EditarRegistro(nacionalidad);
    }

    @Override
    public int EliminarRegistro(int id) {
        return dRNacionalidad.EliminarRegistro(id);
    }
}
