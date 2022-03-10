package ni.edu.uca.ConexionBD.controllers;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/genero")
public class GeneroController {

    @Autowired
    GeneroService genS;

    @RequestMapping("/listar")
    public List<Map<String, Object>> listar(){
        return genS.MostrarRegistro();
    }

    @PostMapping("/agregar")
    public String agregarGen(@RequestBody Genero gen){
        String msg = "Error al guardar registro...";
         int b = genS.GuardarRegistro(gen);
         if(b==1)msg="Registrar guardado satisfactoriament...";
         return "";
    }

    @PutMapping("/actualizar/{id}")
    public String editarGen(@RequestBody Genero gen, @PathVariable int id, Model model){
        String msg = "Error al guardar registro...";
        gen.setIdGenero(id);
        int b = genS.EditarRegistro(gen);
        if(b==1)msg="Cambios realizados satisfactoriamente...";
        return msg;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarGen(@PathVariable int id, Model model){
        String msg = "Error al eliminar registro...";
        int b = genS.EliminarRegistro(id);
        if(b==1) msg = "Registro eliminado...";
        return msg;
    }

}
