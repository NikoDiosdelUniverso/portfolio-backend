
package com.portfolio.app.Services;

import com.portfolio.app.model.experiencia;
import com.portfolio.app.repository.experienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
@Autowired
public experienciaRepository expRepo;
    
    @Override
    public List<experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Integer id) {
        expRepo.deleteById(id);
    }

    @Override
    public experiencia buscarExperiencia(Integer id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
