package com.example.datax.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String contactNumber;

    public Long getId(){return id;}
    public String getName(){return name;}
    public String getCity(){return city;}
    public String getContactNumber(){return contactNumber;}

    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
}
