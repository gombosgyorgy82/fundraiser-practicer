package com.example.fundraiserpracticer.controller;

import com.example.fundraiserpracticer.dto.incoming.AccountRegistrationCommand;
import com.example.fundraiserpracticer.dto.outgoing.AccountDetails;
import com.example.fundraiserpracticer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@RestController
@RequestMapping("/api/accounts")

public class AccountController {

    private AccountService accountService;

@Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Void> registerAccount (HttpServletRequest request, @RequestBody
    AccountRegistrationCommand accountRegistrationCommand) {
    String ipAddress = request.getRemoteAddr();


   Long id = accountService.createAccount(accountRegistrationCommand, ipAddress);

   return ResponseEntity.created(URI.create("/api/accounts/" + id)).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDetails> getAccountDetailsById(@PathVariable ("id") Long id) {

    AccountDetails accountDetails = accountService.getAccountDetailsById(id);

    return new ResponseEntity<>(accountDetails, HttpStatus.OK);
    }
}
