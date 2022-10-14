package com.miportfolio.jp.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAcerca {
    @NotBlank
    private String descripcion;

    public dtoAcerca() {
    }

    public dtoAcerca(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
