package com.ar.cac.tpfinal.mappers;

import com.ar.cac.tpfinal.entities.Account;
import com.ar.cac.tpfinal.entities.dtos.AccountDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AccountMapper {

    public AccountDto accountToDto(Account account){
        AccountDto dto = new AccountDto();

        dto.setId(account.getId());
        dto.setType(account.getType());
        dto.setCbu(account.getCbu());
        dto.setAlias(account.getAlias());
        dto.setAmount(account.getAmount());

        return dto;
    }

    public Account dtoToAccount(AccountDto dto){
        Account account = new Account();

        account.setAlias(dto.getAlias());
        account.setType(dto.getType());
        account.setCbu(dto.getCbu());
        account.setAmount(dto.getAmount());

        return account;
    }
}
