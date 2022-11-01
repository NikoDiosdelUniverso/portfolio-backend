
package com.portfolio.app.Services;

import com.portfolio.app.model.educacion;
import com.portfolio.app.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
            @Autowired
    public educacionRepository eduRepo;
    
    @Override
    public List<educacion> verEducacion() {
        return eduRepo.findAll();
}

    @Override
    public void crearEducacion(educacion per) {
       eduRepo.save(per);
    }

        @Override
    public void borrarEducacion(Integer id) {
       eduRepo.deleteById(id);
    }

        @Override
    public educacion buscarEducacion(Integer id) {
        return eduRepo.findById(id).orElse(null);
    }


}
