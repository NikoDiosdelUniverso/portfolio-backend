
package com.portfolio.app.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class proyectos implements Serializable {
     @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
    private String nombre;
    
    private String imagen;
    
    private String linkSitio;
    
    private String linkCodigo;
   
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLinkSitio() {
        return linkSitio;
    }

    public void setLinkSitio(String linkSitio) {
        this.linkSitio = linkSitio;
    }

    public String getLinkCodigo() {
        return linkCodigo;
    }

    public void setLinkCodigo(String linkCodigo) {
        this.linkCodigo = linkCodigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
