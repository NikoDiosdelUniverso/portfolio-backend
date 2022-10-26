
package com.app.portfoliotest.repository;

import com.app.portfoliotest.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface educacionRepository extends JpaRepository <Educacion, Long> {
    
}
