package com.jenkins.entities;



public class Accounts {

  
    private int id;
    private String username;
    private String password;

  
    public Accounts(){
        
    }
    

    public Accounts(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String toString() {
        return "Accounts [id=" + id + ", password=" + password + ", username=" + username + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

        
}
