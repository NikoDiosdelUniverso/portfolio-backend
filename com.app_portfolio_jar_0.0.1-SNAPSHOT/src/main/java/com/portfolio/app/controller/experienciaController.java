package com.portfolio.app.controller;

import com.portfolio.app.Services.IExperienciaService;
import com.portfolio.app.model.experiencia;
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
@RequestMapping(path = "/exp")
@CrossOrigin(origins = "http://localhost:4200/")
public class experienciaController {

    @Autowired
    private IExperienciaService expServ;

    @PostMapping("/new")
    public @ResponseBody
    String agregarExperiencia(@RequestBody experiencia exp) {
        expServ.crearExperiencia(exp);
        return "Guardado";
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
        @GetMapping("detail/{id}")
     public @ResponseBody experiencia detailEducacion(@PathVariable Integer id) {
         experiencia exp= expServ.buscarExperiencia(id);
         return exp;
     }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    String borrarExperiencia(@PathVariable Integer id) {
        expServ.borrarExperiencia(id);
        return "Eliminado";
    }

    @PutMapping("/editar/{id}")
    public @ResponseBody
    String editarExperiencia(@PathVariable Integer id,
            @RequestParam("posicion") String nuevoposicion,
            @RequestParam("empresa") String nuevoempresa,
            @RequestParam("inicio") String nuevoinicio,
            @RequestParam("fin") String nuevofin,
            @RequestParam("descripcion") String nuevoDescripcion,
            @RequestParam("logo") String nuevologo) {
        experiencia experiencia = expServ.buscarExperiencia(id);
        experiencia.setPosicion(nuevoposicion);
        experiencia.setEmpresa(nuevoempresa);
        experiencia.setInicio(nuevoinicio);
        experiencia.setFin(nuevofin);
        experiencia.setDescripcion(nuevoDescripcion);
        experiencia.setLogo(nuevologo);
        expServ.crearExperiencia(experiencia);
        return "Guardado";
    }
}
