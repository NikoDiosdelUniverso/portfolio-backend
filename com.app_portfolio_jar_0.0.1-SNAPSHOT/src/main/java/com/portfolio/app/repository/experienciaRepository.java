
package com.portfolio.app.repository;

import com.portfolio.app.model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository<experiencia, Integer> {
    
}
