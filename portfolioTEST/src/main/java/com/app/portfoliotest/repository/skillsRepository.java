
package com.app.portfoliotest.repository;

import com.app.portfoliotest.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface skillsRepository extends JpaRepository <Skills, Long> {
    
}
