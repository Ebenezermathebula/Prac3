package com.adp3.submissions;

public interface Transaction {

    public double deposit(long accountNo, double amount);

    public double withdraw(long accountNo, double amount);

    public double balance(long accountNo);

}
