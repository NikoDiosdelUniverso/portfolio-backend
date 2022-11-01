package com.portfolio.app.Services;

import com.portfolio.app.model.habilidades;
import java.util.List;

public interface IHabilidadesService {

    public List<habilidades> verSkills();

    public void crearSkill(habilidades skill);

    public void borrarSkill(Integer id);

    public habilidades buscarSkill(Integer id);

}
