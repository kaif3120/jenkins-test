package com.jenkins.controller;

import java.util.List;



import com.jenkins.entities.Accounts;
import com.jenkins.fakeService.AccountsService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class AccountController {

    @Autowired
    private AccountsService accountsService;
    

    @GetMapping("/account")
    public List<Accounts> getAccounts(){
        return accountsService.findAll();
    } 

    @PostMapping(value="/account")
    public Accounts addAccounts(@RequestBody Accounts account) {
        System.out.println(account);
        return this.accountsService.save(account);
    }
    

}
