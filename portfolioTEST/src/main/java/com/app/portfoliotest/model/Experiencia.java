
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
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String posicion;
    private String empresa;
    private String logo;
    private String inicio;
    private String fin;
    private String descripcion;
    
    public Experiencia() {
        
    }
    
    public Experiencia(Long id,String posicion,String empresa, String logo, String inicio,String fin,String descripcion) {
           this.id = id;
           this.posicion = posicion;
           this.empresa = empresa;
           this.logo= logo;
           this.inicio = inicio;
           this.fin = fin;
           this.descripcion = descripcion ;
    }
    
}
