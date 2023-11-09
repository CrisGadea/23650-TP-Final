package com.ar.cac.tpfinal.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String dni;

    private String address;

    private Date birthday_date;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
}
