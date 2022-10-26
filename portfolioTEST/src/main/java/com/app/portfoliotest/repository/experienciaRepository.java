
package com.app.portfoliotest.repository;

import com.app.portfoliotest.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository <Experiencia, Long> {
    
}
