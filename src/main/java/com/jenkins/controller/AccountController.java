package com.jenkins.controller;

import java.util.List;



import com.jenkins.entities.Accounts;
import com.jenkins.repository.AccountsRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;



@RestController
public class AccountController {
    
    @Autowired
    private AccountsRep accountsRep;


    @GetMapping("/account")
    public List<Accounts> getAccounts(){
        return this.accountsRep.findAll();
    } 

    @PostMapping(value="/account")
    public Accounts addAccounts(@RequestBody Accounts account) {
        System.out.println(account);
        return this.accountsRep.save(account);
    }
    

}
