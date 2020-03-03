package com.adp3.submissions;

public class Account{

    private long accountNo;
    private double balance;

    public Account(long accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        String message = String.format("Account No: %d\nBalance: %.2f", getAccountNo(), getBalance());
        return message;
    }


}
