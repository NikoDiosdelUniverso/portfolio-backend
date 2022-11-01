package com.portfolio.app.Services;

import com.portfolio.app.model.proyectos;
import com.portfolio.app.repository.proyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public proyectosRepository proRepo;

    @Override
    public List<proyectos> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyecto(proyectos proyec) {
        proRepo.save(proyec);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proRepo.deleteById(id);
    }

    @Override
    public proyectos buscarProyecto(Integer id) {
        return proRepo.findById(id).orElse(null);
    }

}
