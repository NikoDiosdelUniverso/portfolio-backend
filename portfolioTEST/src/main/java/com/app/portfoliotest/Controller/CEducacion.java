package com.app.portfoliotest.Controller;

import com.app.portfoliotest.model.Educacion;
import com.app.portfoliotest.service.IEducacionservice;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CEducacion {

    
    private IEducacionservice eduServ;
    public CEducacion(IEducacionservice eduServ) {
        this.eduServ = eduServ;
    }

    @PostMapping("/newedu")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }

    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }

    @DeleteMapping("/deleteedu/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @PutMapping("/educacion/editar/{id}")
    public Educacion editarEducacion(@PathVariable Long id,
            @RequestParam("Titulo") String nuevoTitulo,
            @RequestParam("Establecimiento") String nuevoEstablecimiento,
            @RequestParam("inicio") String nuevoinicio,
            @RequestParam("fin") String nuevofin,
            @RequestParam("descripcion") String nuevoDescripcion,
            @RequestParam("logo") String nuevologo) {
        Educacion educacion = eduServ.buscarEducacion(id);
        educacion.setTitulo(nuevoTitulo);
        educacion.setEstablecimiento(nuevoEstablecimiento);
        educacion.setInicio(nuevoinicio);
        educacion.setFin(nuevofin);
        educacion.setDescripcion(nuevoDescripcion);
        educacion.setLogo(nuevologo);
        eduServ.crearEducacion(educacion);
        return educacion;
    }
}
