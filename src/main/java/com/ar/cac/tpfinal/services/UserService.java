package com.ar.cac.tpfinal.services;

import com.ar.cac.tpfinal.entities.dtos.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<String> getUsers(){
        List<String> users = new ArrayList<String>();
        users.add("Cristian");
        users.add("Maximiliano");
        users.add("Solana");
        return users;
    }

    public String getUserById(Long id){
        List<String> users = this.getUsers();

        return users.get(0);
    }

    public UserDto createUser(UserDto user){
        List<String> users = this.getUsers();
        users.add(user.getUsername());
        return user;
    }


    }
