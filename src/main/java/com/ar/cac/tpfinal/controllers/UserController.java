package com.ar.cac.tpfinal.controllers;

import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    // POR CADA ACCIÓN/METODO HTTP QUE USTEDES QUIERAN IMPLEMENTAR/PERMITIR
    // VAN A TENER UN METODO EN SU CONTROLADOR

    // METODOS HTTP PERMITIDOS:
    // POST, GET (2), PUT, PATCH, DELETE

    // Estructura de datos para REST: ResponseEntity<>

    // Necesito obtener una instancia del servicio de usuarios
    @Autowired
    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    // Obtener una lista de usuarios registrados

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    // Obtener la info de un solo usuario


    @GetMapping(value = "/users/{id}")
    public User getUserById(@PathVariable Long id){
        //return "Cristian";
        return service.getUserById(id);
    }

    // Crear/Registrar un usuario

    @PostMapping(value = "/users")
    public UserDto createUser(@RequestBody UserDto user){
        return service.createUser(user);
    }

    // Modificar TOTALMENTE un usuario (PUT)
    public String updateFullUser(){
        return "";
    }


    // Modificar PARCIALMENTE un usuario (PATCH)

    public String updateParcialUser(){
        return "";
    }

    // Eliminar un usuario

    public void deleteUser(){

    }

}
