package com.example.fundraiserpracticer.service;

import com.example.fundraiserpracticer.domain.Account;
import com.example.fundraiserpracticer.dto.incoming.AccountRegistrationCommand;
import com.example.fundraiserpracticer.dto.outgoing.AccountDetails;
import com.example.fundraiserpracticer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class AccountService {



    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long createAccount(AccountRegistrationCommand accountRegistrationCommand, String ipAddress) {

        Account account = new Account();
        account.setUsername(accountRegistrationCommand.getName());
        account.setGoal(accountRegistrationCommand.getGoal());
        account.setBalance(5000);
        account.setFund(0);
        account.setIpAddress(ipAddress);

        accountRepository.save(account);

        return account.getId();
    }

    public AccountDetails getAccountDetailsById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        return new AccountDetails(account) ;
    }
}
