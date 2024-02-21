/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.atm.model;

/**
 *
 * @author Dabo
 */
public class AuthService {
    private ClienteRepository clienteRepository;
    
    public boolean autenticarCliente(String numeroTarjeta, String pin) {
     Cliente cliente = clienteRepository.findByNumeroTarjeta(numeroTarjeta);
     return cliente != null && cliente.getPin().equals(pin);
    }
}
