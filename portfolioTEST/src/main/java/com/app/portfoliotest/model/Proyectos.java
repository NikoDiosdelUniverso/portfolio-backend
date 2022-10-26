
package com.app.portfoliotest.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
       private Long id;
    
    private String nombre;
    private String imagen;
    private String linkSitio;
    private String linkCodigo;
    private String descripcion;
    
    public Proyectos() {
        
    }
    
    public Proyectos(Long id,String nombre,String imagen, String linkSitio,String linkCodigo,String descripcion) {
           this.id = id;
           this.nombre = nombre;
           this.imagen = imagen;
           this.linkSitio = linkSitio;
           this.linkCodigo = linkCodigo;
           this.descripcion = descripcion ;
    }
}
