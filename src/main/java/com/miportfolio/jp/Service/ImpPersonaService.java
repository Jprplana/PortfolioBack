package com.miportfolio.jp.Service;

import com.miportfolio.jp.Entity.Persona;
import com.miportfolio.jp.Interface.IPersonaService;
import com.miportfolio.jp.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaService implements IPersonaService {
    
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List <Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Integer id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Integer id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
