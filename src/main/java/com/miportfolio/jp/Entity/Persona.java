package com.miportfolio.jp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

<<<<<<< HEAD
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

    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;

=======

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Size(min=1, max=50, message="no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min=1, max=50, message="no cumple con la longitud")
    private String apellido;
    
    @Size(min=1, max=50, message="no cumple con la longitud")
    private String img;
    
    
    
>>>>>>> 87d022294441672a80be3db2ef92f01730379cc5
}
