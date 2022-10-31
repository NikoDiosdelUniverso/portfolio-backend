package com.portfolio.app.controller;

import com.portfolio.app.Services.IExperienciaService;
import com.portfolio.app.model.experiencia;
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
@RequestMapping(path = "/exp")
@CrossOrigin(origins = "http://localhost:4200/")
public class experienciaController {

    @Autowired
    private IExperienciaService expServ;

    @PostMapping("/new")
    public ResponseEntity<?> agregarExperiencia(@RequestBody experiencia exp) {
        expServ.crearExperiencia(exp);
        return new ResponseEntity(HttpStatus.OK);
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
    public ResponseEntity<?> borrarExperiencia(@PathVariable Integer id) {
        expServ.borrarExperiencia(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarExperiencia(@PathVariable Integer id,
            @RequestBody experiencia exp) {
        experiencia exper = expServ.buscarExperiencia(id);
        exper.setPosicion(exp.getPosicion());
        exper.setEmpresa(exp.getEmpresa());
        exper.setInicio(exp.getInicio());
        exper.setFin(exp.getFin());
        exper.setDescripcion(exp.getDescripcion());
        exper.setLogo(exp.getLogo());
        expServ.crearExperiencia(exper);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
