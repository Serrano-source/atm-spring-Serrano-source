/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.daw.atm.model;

/**
 *
 * @author Dabo
 */
public class Person {
    
    private Long id;
    private String numeroTarjeta;
    private String pin;
    
    public Person(){
        
    }

    public Person(String numeroTarjeta, String pin){
        this.numeroTarjeta = numeroTarjeta;
        this.pin = pin;
    }
    
    // Getters y setters
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getNumeroTarjeta(){
        return numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }
    
    public String getPin(){
        return pin;
    }
    
    public void setPin(String pin){
        this.pin = pin;
    }
}