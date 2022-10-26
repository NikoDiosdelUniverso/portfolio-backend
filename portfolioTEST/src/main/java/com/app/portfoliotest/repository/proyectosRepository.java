
package com.app.portfoliotest.repository;

import com.app.portfoliotest.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface proyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
