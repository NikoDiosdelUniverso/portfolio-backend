
package com.portfolio.app.controller;

import com.portfolio.app.Services.IEducacionService;
import com.portfolio.app.model.educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/edu")
@CrossOrigin(origins = "http://localhost:4200/")
public class educacionController {
    @Autowired 
  private IEducacionService eduServ;

 @PostMapping("/new")
    public @ResponseBody String agregarEducacion(@RequestBody educacion edu) {
        eduServ.crearEducacion(edu);
    return "Saved";
    }

    @GetMapping("/ver")
    public @ResponseBody List<educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @GetMapping("detail/{id}")
     public @ResponseBody educacion detailEducacion(@PathVariable Integer id) {
         educacion edu= eduServ.buscarEducacion(id);
         return edu;
     }


    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String borrarEducacion(@PathVariable Integer id) {
        eduServ.borrarEducacion(id);
        return "Eliminado";
    }

    @PutMapping("/editar/{id}")
    public @ResponseBody String editarEducacion(@PathVariable Integer id,
            @RequestParam("Titulo") String nuevoTitulo,
            @RequestParam("Establecimiento") String nuevoEstablecimiento,
            @RequestParam("inicio") String nuevoinicio,
            @RequestParam("fin") String nuevofin,
            @RequestParam("descripcion") String nuevoDescripcion,
            @RequestParam("logo") String nuevologo) {
        educacion educacion = eduServ.buscarEducacion(id);
        educacion.setTitulo(nuevoTitulo);
        educacion.setEstablecimiento(nuevoEstablecimiento);
        educacion.setInicio(nuevoinicio);
        educacion.setFin(nuevofin);
        educacion.setDescripcion(nuevoDescripcion);
        educacion.setLogo(nuevologo);
        eduServ.crearEducacion(educacion);
        return "Saved";
    }
}


   