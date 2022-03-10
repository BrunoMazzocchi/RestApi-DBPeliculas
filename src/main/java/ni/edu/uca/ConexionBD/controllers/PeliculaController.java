package ni.edu.uca.ConexionBD.controllers;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/pelicula")
public class PeliculaController {

    @Autowired
    PeliculaService pelS;

    @RequestMapping("/listar")
    public List<Map<String, Object>> listar(){return pelS.MostrarRegistro();}

    @PostMapping("/agregar")
    public String agregarPel(@RequestBody Pelicula pel){
        String msg = "Error al guardar registro...";
        int b = pelS.GuardarRegistro(pel);
        if(b == 1) msg = "Registrar guardado satisfactoriamente...";
        return msg;
    }

    @PutMapping("/actualizar/{id}")
    public String editarPelicula(@RequestBody Pelicula pel, @PathVariable int id, Model model) {
        String msg = "Error al guardar registro...";
        pel.setIdPelicula(id);
        int b = pelS.EditarRegistro(pel);
        if (b == 1) msg = "Cambios realizados satisfactoriamente...";
        return msg;
    }
    @DeleteMapping("/eliminar/{id}")
    public String eliminarPel(@PathVariable int id, Model model) {
        String msg = "Error al eliminar registro...";
        int b = pelS.EliminarRegistro(id);
        if(b==1) msg = "Registro eliminado...";
        return msg;
    }
}
