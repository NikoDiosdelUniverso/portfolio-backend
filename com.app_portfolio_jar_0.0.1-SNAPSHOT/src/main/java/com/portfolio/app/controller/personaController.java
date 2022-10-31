package com.portfolio.app.controller;

import com.portfolio.app.Services.IPersonaService;
import com.portfolio.app.model.persona;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/persona")
@CrossOrigin(origins = "http://localhost:4200/")
public class personaController {

    @Autowired
    private IPersonaService personaServ;

    @PostMapping(path = "/add")
    public @ResponseBody
    String agregarPersona(@RequestBody persona pers) {
        personaServ.crearPersona(pers);
        return "Saved";
    }

    @GetMapping(path = "/lista")
    public ResponseEntity<List<persona>> verPersonas() {
        List<persona> list = personaServ.verPersonas();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping(path ="/ver/{id}")
    public @ResponseBody persona verDetalle(@PathVariable Integer id){
        persona pers = personaServ.buscarPersona(id);
        return pers;
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Integer id) {
        personaServ.borrarPersona(id);
    }

   
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarPersona(@PathVariable Integer id,
            @RequestBody persona pers) {
        persona persona = personaServ.buscarPersona(id);
        persona.setNombre(pers.getNombre());
        persona.setApellido(pers.getApellido());
        persona.setFoto(pers.getFoto());
        persona.setDescripcion(pers.getDescripcion());
        persona.setBanner(pers.getBanner());
        persona.setTitulo(pers.getTitulo());
        personaServ.crearPersona(persona);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
