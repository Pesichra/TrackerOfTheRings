package com.example.trackeroftherings;

import java.io.Serializable;

public abstract class Account implements Serializable {
    private String username;
    private String password;
    private String companyID;
    private Company company;
    //empty constructor for database
    public Account(){}

    //getters and setters
    public String getUsername() {
        return username;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public String getCompanyID() {
        return companyID;
    }
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    //to do
    public Company authenticateCompanyID(String ID){
        return new Company();
    }

    public boolean login(String name, String password, String companyID){
        //magical stuff from firebase

        return true;
    }




    
    
}
