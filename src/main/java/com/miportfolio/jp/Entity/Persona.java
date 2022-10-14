package com.miportfolio.jp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;

    @NotNull
    private String descripcion;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String lugar;
    
    private String img;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String lugar, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.img = img;
    }
    
    
}
