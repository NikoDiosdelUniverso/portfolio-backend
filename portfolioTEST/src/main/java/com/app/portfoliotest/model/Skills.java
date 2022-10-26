
package com.app.portfoliotest.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Skills implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String logo;

    public Skills() {
        
    }
    
    public Skills(Long id,String nombre,String logo) {
           this.id = id;
           this.nombre = nombre;
           this.logo = logo;

    }
    
}
