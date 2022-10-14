package com.miportfolio.jp.Controller;

import com.miportfolio.jp.Dto.dtoAcerca;
import com.miportfolio.jp.Entity.Acerca;
import com.miportfolio.jp.Security.Controller.Mensaje;
import com.miportfolio.jp.Service.SAcerca;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acerca")
@CrossOrigin(origins = {"https://miportfoliojpfront.web.app", "https://localhost:4200"})
public class CAcerca {

    @Autowired
    SAcerca sacerca;

    @GetMapping("/lista")
    public ResponseEntity<List<Acerca>> list() {
        List<Acerca> list = sacerca.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id") int id) {
        if (!sacerca.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Acerca acerca = sacerca.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcerca dtoacerca) {
        if (StringUtils.isBlank(dtoacerca.getDescripcion())) {
            return new ResponseEntity(new Mensaje("Este espacio no puede estar en blanco"), HttpStatus.BAD_REQUEST);
        }

        Acerca acerca = new Acerca(dtoacerca.getDescripcion());
        sacerca.save(acerca);

        return new ResponseEntity(new Mensaje("Descripción personal agregada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAcerca dtoacerca) {
        if (!sacerca.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(dtoacerca.getDescripcion())) {
            return new ResponseEntity(new Mensaje("Este espacio no puede estar en blanco"), HttpStatus.BAD_REQUEST);
        }

        Acerca acerca = sacerca.getOne(id).get();
        acerca.setDescripcion(dtoacerca.getDescripcion());

        sacerca.save(acerca);
        return new ResponseEntity(new Mensaje("Descripción personal actualizada"), HttpStatus.OK);

    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!sacerca.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sacerca.delete(id);
        
        return new ResponseEntity(new Mensaje("Descripción personal eliminada"), HttpStatus.OK);
        
    }

}
