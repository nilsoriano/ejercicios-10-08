package org.example;

import java.math.BigDecimal;
import java.util.HashMap;

public class Account {
    private String name;
    private String address;
    private BigDecimal balance;
    private String accountNumber;
    private Enum Hold;

    public Account(String name, String address, BigDecimal balance, String accountNumber, Enum hold) {
        setName(name);
        setAddress(address);
        setBalance(balance);
        setAccountNumber(accountNumber);
        Hold = hold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Enum getHold() {
        return Hold;
    }

    public void setHold(Enum hold) {
        Hold = hold;
    }
}
