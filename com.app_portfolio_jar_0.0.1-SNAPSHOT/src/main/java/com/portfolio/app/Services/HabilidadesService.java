
package com.portfolio.app.Services;

import com.portfolio.app.model.habilidades;
import com.portfolio.app.repository.habilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {

    @Autowired
    public habilidadesRepository skillRepo;
    
    @Override
    public List<habilidades> verSkills() {
       return skillRepo.findAll();
    }

    @Override
    public void crearSkill(habilidades skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Integer id) {
        skillRepo.deleteById(id);
    }

    @Override
    public habilidades buscarSkill(Integer id) {
        return skillRepo.findById(id).orElse(null);
    }
    
}
