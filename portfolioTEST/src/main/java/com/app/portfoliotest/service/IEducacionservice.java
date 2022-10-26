
package com.app.portfoliotest.service;

import com.app.portfoliotest.model.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IEducacionservice {
    
    public List<Educacion> verEducacion ();
public void crearEducacion (Educacion edu);
public void borrarEducacion (Long id);
public Educacion buscarEducacion (Long id);

}
