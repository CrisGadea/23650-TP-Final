package com.ar.cac.tpfinal.entities;

import com.ar.cac.tpfinal.entities.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cuentas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_cuenta")
    private AccountType type;

    private String cbu;

    private String alias;

    @Column(name = "monto")
    private BigDecimal amount;

    @Column(name = "fecha_creacion")
    private LocalDateTime created_at;

    @Column(name = "fecha_modificacion")
    private LocalDateTime updated_at;

    //@
    //private User owner;
}
