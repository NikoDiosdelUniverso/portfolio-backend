
package com.portfolio.app.Services;

import com.portfolio.app.model.persona;
import java.util.List;


public interface IPersonaService {
        public List<persona> verPersonas();

    public void crearPersona(persona per);

    public void borrarPersona(Integer id);

    public persona buscarPersona(Integer id);

}
