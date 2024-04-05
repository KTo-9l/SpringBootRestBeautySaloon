package com.beautysaloon.springbootrest.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Stylists")
@NamedQuery(name = "Stylists.getAll", query = "SELECT s from Stylists s")
public class Stylists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", length = 255)
    private String name;
    @Column(name="isDeleted")
    private Boolean isDeleted;
    public Stylists(Integer id, String name, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.isDeleted = isDeleted;
    }
    public Stylists() {}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getDeleted() {
        return isDeleted;
    }
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}