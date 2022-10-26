
package com.app.portfoliotest.service;

import com.app.portfoliotest.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
       public List<Experiencia> verExperiencia ();
public void crearExperiencia (Experiencia exp);
public void borrarExperiencia (Long id);
public Experiencia buscarExperiencia (Long id);
 
}
