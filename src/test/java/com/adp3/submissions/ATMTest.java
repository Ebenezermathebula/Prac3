package com.adp3.submissions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {

    ATM atm;
    Account[] clients = new Account[3];

    @Before
    public void setUp(){
        clients[0] = new BusinessAccount("Google Inc", 123456, 900000);
        clients[1] = new Account(654321, 500);
        clients[2] = new Account(10111, 1000);

        atm = new ATM(clients);
    }

    @After
    public void tearDown(){}

    @Test
    public void deposit() {
        System.out.println(clients[0].toString());

        double result = atm.deposit(123456, 100000);

        System.out.println("\n\n"+clients[0].toString());

        Assert.assertEquals(1000000, result, 2);
    }

    @Test
    public void withdraw() {
        System.out.println(clients[2].toString());

        double result = atm.withdraw(10111, 230);

        System.out.println("\n\n"+clients[2].toString());

        Assert.assertEquals(770, result, 2);
    }

    @Test
    public void balance() {
        System.out.println(clients[1].toString());

        double result = atm.balance(10111);

        Assert.assertEquals(1000, result, 2);
    }


}
