
package com.portfolio.app.repository;

import com.portfolio.app.model.habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface habilidadesRepository extends JpaRepository<habilidades, Integer> {
    
}
