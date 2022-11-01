
package com.portfolio.app.Services;

import com.portfolio.app.model.educacion;
import java.util.List;


public interface IEducacionService {
            public List<educacion> verEducacion();

    public void crearEducacion(educacion edu);

    public void borrarEducacion(Integer id);

    public educacion buscarEducacion(Integer id);
}
