package com.jenkins.fakeService;

import java.util.List;

import com.jenkins.entities.Accounts;

import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    static List<Accounts> accounts = List.of(
        new Accounts(1,"kaif3120","password"),
        new Accounts(2,"zaid","pass"),
        new Accounts(3,"areez","pass"),
        new Accounts(4,"dilkash","pass")
    );
    
    public List<Accounts> findAll(){
        return accounts;
    }
    public Accounts save(Accounts account){
        accounts.add(account);
        return account;
    }

}
