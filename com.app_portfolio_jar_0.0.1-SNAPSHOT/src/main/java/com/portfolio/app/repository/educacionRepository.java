
package com.portfolio.app.repository;

import com.portfolio.app.model.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository<educacion, Integer> {
    
}
