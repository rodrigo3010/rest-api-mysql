package com.example.rest_api_mysql.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Regionid;
    private String nameRegion;
    private String ubicacion;

    public Integer getId() {
        return Regionid;
    }

    public void setId(Integer id) {
        this.Regionid = id;
    }

    public String getName() {
        return nameRegion;
    }

    public void setName(String name) {
        this.nameRegion = nameRegion;
    }

    public String getLastname() {
        return ubicacion;
    }

    public void setLastname(String lastname) {
        this.ubicacion = ubicacion;
    }

}
