
package com.app.portfoliotest.repository;

import com.app.portfoliotest.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository <Persona, Long> {
    
}
