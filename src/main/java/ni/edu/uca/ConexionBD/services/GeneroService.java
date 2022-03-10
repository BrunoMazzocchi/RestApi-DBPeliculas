package ni.edu.uca.ConexionBD.services;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class GeneroService implements  GeneroIRepository{
    @Autowired
    GeneroDRepository dRGenero;

    @Override
    public List<Map<String, Object>> MostrarRegistro() {
        return dRGenero.MostrarRegistro();
    }

    @Override
    public int GuardarRegistro(Genero genero){
        return dRGenero.GuardarRegistro(genero);
    }

    @Override
    public int EditarRegistro(Genero genero) {
        return dRGenero.EditarRegistro(genero);
    }

    @Override
    public int EliminarRegistro(int id) {
        return dRGenero.EliminarRegistro(id);
    }
}
