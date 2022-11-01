
package com.portfolio.app.repository;

import com.portfolio.app.model.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends JpaRepository<proyectos, Integer> {
    
}
