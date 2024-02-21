/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.atm.controllers;

import com.daw.atm.model.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dabo
 */
@RestController
public class CajeroController {
    private AuthService authService;
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String numeroTarjeta, @RequestParam String pin) {
        if (authService.autenticarCliente(numeroTarjeta, pin)) {
            return ResponseEntity.ok("Inicio de sesión exitoso");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Inicio de sesión fallido");
        }
    }
}