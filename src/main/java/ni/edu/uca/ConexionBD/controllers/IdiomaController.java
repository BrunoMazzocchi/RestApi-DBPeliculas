package ni.edu.uca.ConexionBD.controllers;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.repositories.*;
import ni.edu.uca.ConexionBD.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/idioma")
public class IdiomaController {
    @Autowired
    IdiomaService idioS;

    @RequestMapping("/listar")
    public List<Map<String, Object>> listar() { return idioS.MostrarRegistro();}

    @PostMapping("/agregar")
    public String agregarIdio(@RequestBody Idioma idio){
        String msg = "Error al guardar registro...";
        int b = idioS.GuardarRegistro(idio);
        if(b == 1) msg = "Registrar guardado satisfactoriamente...";
        return "";
    }

    @PutMapping("/actualizar/{id}")
    public String editarIdioma(@RequestBody Idioma idio, @PathVariable int id, Model model){
        String msg = "Error al guardar registro...";
        idio.setIdIdioma(id);
        int b = idioS.EditarRegistro(idio);
        if (b==1) msg = "Cambios realizados satisfactoria...";
        return msg;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarIdio(@PathVariable int id,Model model) {
        String msg = "Error al eliminar registro...";
        int b = idioS.EliminarRegistro(id);
        if(b==1) msg = "Registro eliminado...";
        return msg;
    }
}
