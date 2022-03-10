package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public class NacionalidadDRepository implements NacionalidadIRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Map<String, Object>> MostrarRegistro(){
        List<Map<String, Object>> lista = template.queryForList("Select * from Nacionalidad");
        return lista;
    }

    @Override
    public int GuardarRegistro(Nacionalidad nacionalidad) {
        int b = 0;
        b = template.update("Insert into Nacionalidad(nombre, activo) values (?, ?)",
                new Object[] {nacionalidad.getNombre(), nacionalidad.isActivo()});
        return b;
    }

    @Override
    public int EditarRegistro(Nacionalidad nacionalidad) {
        int b = 0;
        b = template.update("Update Nacionalidad set nombre = ?, activo = ? where idNacionalidad = ?",
                new Object[] {nacionalidad.getNombre(), nacionalidad.isActivo(), nacionalidad.getIdNacionalidad()});
        return b;
    }

    @Override
    public int EliminarRegistro(int id) {
        int b = 0;
        b = template.update("Delete from Nacionalidad where idNacionalidad = ?", id);
        return b;
    }
}
