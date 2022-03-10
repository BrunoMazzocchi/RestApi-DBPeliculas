package ni.edu.uca.ConexionBD.services;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class PeliculaService implements PeliculaIRepository {
    @Autowired
    PeliculaDRepository dRPelicula;

    @Override
    public List<Map<String, Object>> MostrarRegistro() {
        return dRPelicula.MostrarRegistro();
    }

    @Override
    public int GuardarRegistro(Pelicula pelicula) {
        return dRPelicula.GuardarRegistro(pelicula);
    }

    @Override
    public int EditarRegistro(Pelicula pelicula) {
        return dRPelicula.EditarRegistro(pelicula);
    }

    @Override
    public int EliminarRegistro(int id) {
        return dRPelicula.EliminarRegistro(id);
    }
}
