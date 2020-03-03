package com.adp3.submissions;

public class BusinessAccount extends Account{

    String name;

    public BusinessAccount(String name, long accNo, double bal) {
        super(accNo, bal);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String message = String.format("Name: %s\nAccount No: %d\nBalance: %.2f", getName(), getAccountNo(), getBalance());

        return message;
    }


}
