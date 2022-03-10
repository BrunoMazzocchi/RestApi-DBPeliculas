package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public class PeliculaDRepository implements PeliculaIRepository{

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Map<String, Object>> MostrarRegistro() {
        List<Map<String, Object>> lista = template.queryForList("Select * from Pelicula");
        return lista;
    }

    @Override
    public int GuardarRegistro(Pelicula pelicula) {
        int b = 0;
        b = template.update("Insert into Pelicula(titulo, tipoMetraje, nacionalidad, clasificacion, duracion, sinopsis) values (?,?,?,?,?,?)",
                new Object[] {pelicula.getTitulo(), pelicula.getTipoMetraje(), pelicula.getNacionalidad(), pelicula.getClasificacion(), pelicula.getDuracion(), pelicula.getSinopsis()});
        return b;
    }

    @Override
    public int EditarRegistro(Pelicula pelicula) {
        int b = 0;
        b = template.update("Update Pelicula set titulo = ?, tipoMetraje = ?, nacionalidad = ?, clasificacion = ?, duracion = ?, sinopsis = ? where idPelicula = ?",
                new Object[] {pelicula.getTitulo(), pelicula.getTipoMetraje(), pelicula.getNacionalidad(), pelicula.getClasificacion(), pelicula.getDuracion(), pelicula.getSinopsis(), pelicula.getIdPelicula()});
        return b;
    }

    @Override
    public int EliminarRegistro(int id) {
        int b = 0;
        b = template.update("Delete from Pelicula where idPelicula = ?", id);
        return b;
    }
}
