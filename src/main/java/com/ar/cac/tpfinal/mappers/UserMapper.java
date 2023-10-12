package com.ar.cac.tpfinal.mappers;

import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;

public class UserMapper {

    public User dtoTouser(UserDto dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }

    public UserDto userToDto(User user){
        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        return dto;
    }
}
