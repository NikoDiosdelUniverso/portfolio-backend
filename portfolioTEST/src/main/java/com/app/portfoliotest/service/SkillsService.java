
package com.app.portfoliotest.service;

import com.app.portfoliotest.model.Skills;
import com.app.portfoliotest.repository.skillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {

    @Autowired(required=false)
    public skillsRepository skillRepo;
    
    @Override
    public List<Skills> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkill(Long id) {
       return skillRepo.findById(id).orElse(null);
    }
    
}
