package com.miportfolio.jp.Repository;

import com.miportfolio.jp.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RAcerca extends JpaRepository<Acerca, Integer>{
    Optional<Acerca> findById(int id);
    public boolean existsById(int id);
    
}
