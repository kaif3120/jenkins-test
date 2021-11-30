package com.jenkins.repository;

import com.jenkins.entities.Accounts;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountsRep extends JpaRepository<Accounts,Integer> {
   
}
