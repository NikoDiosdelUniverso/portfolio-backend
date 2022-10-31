
package com.portfolio.app.controller;


import com.portfolio.app.Services.IProyectosService;
import com.portfolio.app.model.proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/pro")
@CrossOrigin(origins = "http://localhost:4200/")
public class proyectosController {
        @Autowired 
         private IProyectosService proServ;
    
         @PostMapping("/new")
    public @ResponseBody String agregarProyecto(@RequestBody proyectos pro) {
        proServ.crearProyecto(pro);
        return "Guardado";
    }

    @GetMapping("/ver")
    @ResponseBody
    public Iterable<proyectos> verProyecto() {
        return proServ.verProyectos();
    }
    
        @GetMapping("detail/{id}")
     public @ResponseBody proyectos detailEducacion(@PathVariable Integer id) {
         proyectos pro= proServ.buscarProyecto(id);
         return pro;
     }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable Integer id) {
        proServ.borrarProyecto(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarProyecto(@PathVariable Integer id,
            @RequestBody proyectos pro) {
        proyectos proyecto = proServ.buscarProyecto(id);
        proyecto.setNombre(pro.getNombre());
        proyecto.setLinkSitio(pro.getLinkCodigo());
        proyecto.setLinkCodigo(pro.getLinkCodigo());
        proyecto.setDescripcion(pro.getDescripcion()); 
        proyecto.setImagen(pro.getImagen());
        proServ.crearProyecto(proyecto);
        return new ResponseEntity(HttpStatus.OK);
    }  
    
}
