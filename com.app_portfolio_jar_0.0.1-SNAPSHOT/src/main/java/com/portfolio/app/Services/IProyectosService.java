package com.portfolio.app.Services;

import com.portfolio.app.model.proyectos;
import java.util.List;

public interface IProyectosService {

    public List<proyectos> verProyectos();

    public void crearProyecto(proyectos proyec);

    public void borrarProyecto(Integer id);

    public proyectos buscarProyecto(Integer id);

}
