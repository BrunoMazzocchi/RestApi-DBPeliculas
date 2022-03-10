package ni.edu.uca.ConexionBD.services;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class IdiomaService implements IdiomaIRepository {
    @Autowired
    IdiomaDRepository dRIdioma;


    @Override
    public List<Map<String, Object>> MostrarRegistro() {
        return dRIdioma.MostrarRegistro();
    }

    @Override
    public int GuardarRegistro(Idioma idioma) {
        return dRIdioma.GuardarRegistro(idioma);
    }

    @Override
    public int EditarRegistro(Idioma idioma) {
        return dRIdioma.EditarRegistro(idioma);
    }

    @Override
    public int EliminarRegistro(int id) {
        return dRIdioma.EliminarRegistro(id);
    }
}
