
package com.portfolio.app.autenticacion.repository;

import com.portfolio.app.autenticacion.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, String> {
    
    Usuario findByUserId(String Id);
}
