package com.ar.cac.tpfinal.services;

import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public List<User> getUsers(){
        List<User> users = repository.findAll();
        return users;
    }

    public User getUserById(Long id){
        User user = repository.findById(id).get();
        return user;
    }

    public UserDto createUser(UserDto user){
        //List<String> users = this.getUsers();
        //users.add(user.getUsername());
        return user;
    }


    }
