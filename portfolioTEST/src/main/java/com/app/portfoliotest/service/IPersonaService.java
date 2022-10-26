package com.app.portfoliotest.service;

import com.app.portfoliotest.model.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> verPersonas();

    public void crearPersona(Persona per);

    public void borrarPersona(Long id);

    public Persona buscarPersona(Long id);

}
