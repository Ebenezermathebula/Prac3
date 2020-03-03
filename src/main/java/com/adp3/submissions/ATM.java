package com.adp3.submissions;

public class ATM implements Transaction {

    private Account[] clients;

    ATM(Account[] accounts){
        this.clients = accounts;
    }


    @Override
    public double deposit(long accNo, double amount) {
        int index;

        for(int i=0; i<clients.length; i++){
            if(accNo == clients[i].getAccountNo()){
                clients[i].setBalance(clients[i].getBalance() + amount);

                return clients[i].getBalance();
            }
        }

        return 0;
    }       //end deposit()


    @Override
    public double withdraw(long accNo, double amount) {
        for(int i=0; i<clients.length; i++){
            if(accNo == clients[i].getAccountNo()){
                clients[i].setBalance(clients[i].getBalance() - amount);

                return clients[i].getBalance();
            }
        }

        return 0;
    }       //end withdraw()


    @Override
    public double balance(long accNo) {
        for(int i=0; i<clients.length; i++){
            if(accNo == clients[i].getAccountNo()){
                return clients[i].getBalance();
            }
        }

        return 0;
    }       //end balance()


}
