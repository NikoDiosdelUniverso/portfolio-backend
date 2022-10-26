
package com.app.portfoliotest.service;

import com.app.portfoliotest.model.Proyectos;
import java.util.List;


public interface IProyectosService {
           public List<Proyectos> verProyectos ();
public void crearProyecto (Proyectos proyec);
public void borrarProyecto (Long id);
public Proyectos buscarProyecto (Long id);
 
    
}
