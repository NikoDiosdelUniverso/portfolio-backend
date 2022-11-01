package com.portfolio.app.Services;

import com.portfolio.app.model.experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<experiencia> verExperiencia();

    public void crearExperiencia(experiencia exp);

    public void borrarExperiencia(Integer id);

    public experiencia buscarExperiencia(Integer id);

}
