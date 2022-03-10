package ni.edu.uca.ConexionBD.repositories;

import ni.edu.uca.ConexionBD.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public class IdiomaDRepository implements IdiomaIRepository {
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Map<String, Object>> MostrarRegistro(){
        List<Map<String, Object>> lista = template.queryForList("Select * from Idioma");
        return lista;
    }

    @Override
    public int GuardarRegistro(Idioma idioma) {
        int b = 0;
        b = template.update("Insert into Idioma(nombre, activo) values (?, ?)",
                new Object[] {idioma.getNombre(), idioma.isActivo()});
        return 0;
    }

    @Override
    public int EditarRegistro(Idioma idioma) {
        int b = 0;
        b = template.update("Update Idioma set nombre = ?, activo = ? where idIdioma = ?",
                new Object[] {idioma.getNombre(), idioma.isActivo(), idioma.getIdIdioma()});
        return b;
    }



    @Override
    public int EliminarRegistro(int id) {
        int b = 0;
        b = template.update("Delete from Idioma where idIdioma = ?", id);
        return b;
    }
}
