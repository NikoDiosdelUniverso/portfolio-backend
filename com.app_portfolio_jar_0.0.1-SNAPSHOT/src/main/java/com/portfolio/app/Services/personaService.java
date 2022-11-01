
package com.portfolio.app.Services;

import com.portfolio.app.model.persona;
import com.portfolio.app.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements IPersonaService {
        @Autowired
    public personaRepository personaRepo;
    
    @Override
    public List<persona> verPersonas() {
        return personaRepo.findAll();
}

    @Override
    public void crearPersona(persona per) {
       personaRepo.save(per);
    }

        @Override
    public void borrarPersona(Integer id) {
        personaRepo.deleteById(id);
    }

        @Override
    public persona buscarPersona(Integer id) {
        return personaRepo.findById(id).orElse(null);
    }


}
