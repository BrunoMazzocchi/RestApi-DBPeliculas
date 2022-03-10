package ni.edu.uca.ConexionBD.controllers;

import ni.edu.uca.ConexionBD.models.*;
import ni.edu.uca.ConexionBD.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/nacionalidad")
public class NacionalidadController  {

    @Autowired
    NacionalidadService nacS;

    @RequestMapping("/listar")
    public List<Map<String, Object>> listar(){return nacS.MostrarRegistro();}


    @PostMapping("/agregar")
    public String agregarNac(@RequestBody Nacionalidad naci){
        String msg = "Error al guardar registro...";
        int b = nacS.GuardarRegistro(naci);
        if(b == 1) msg = "Registrar guardado satisfactoriamente...";
        return msg;
    }

    @PutMapping("/actualizar/{id}")
    public String editarNacionalidad(@RequestBody Nacionalidad naci, @PathVariable int id, Model model) {
        String msg = "Error al guardar registro...";
        naci.setIdNacionalidad(id);
        int b = nacS.EditarRegistro(naci);
        if (b == 1) msg = "Cambios realizados satisfactoriamente...";
        return msg;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarNac(@PathVariable int id, Model model) {
        String msg = "Error al eliminar registro...";
        int b = nacS.EliminarRegistro(id);
        if(b==1) msg = "Registro eliminado...";
        return msg;
    }
}
