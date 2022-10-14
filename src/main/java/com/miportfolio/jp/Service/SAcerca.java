package com.miportfolio.jp.Service;

import com.miportfolio.jp.Entity.Acerca;
import com.miportfolio.jp.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SAcerca {
    @Autowired
    RAcerca racerca;
    
    public List<Acerca> list() {
        return racerca.findAll();
    }
    
    public Optional<Acerca> getOne(int id) {
        return racerca.findById(id);
    }
    
    public Optional<Acerca> getById(int id) {
        return racerca.findById(id);
    }
    
    public void save(Acerca texto) {
        racerca.save(texto);
    }
    
    public void delete(int id) {
        racerca.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return racerca.existsById(id);
    }
    
}
