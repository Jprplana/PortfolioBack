package com.miportfolio.jp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Acerca {
    @Id
    private int id;
    private String descripcion;

    public Acerca() {
    }

    public Acerca(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
