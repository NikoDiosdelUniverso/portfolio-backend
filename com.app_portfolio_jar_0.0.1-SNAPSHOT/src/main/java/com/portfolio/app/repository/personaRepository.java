
package com.portfolio.app.repository;

import com.portfolio.app.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository<persona, Integer>{
    
}
