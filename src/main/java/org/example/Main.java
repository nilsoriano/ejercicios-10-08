package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    /*
        Accounts are most often searched by accountNumber. Create a HashMap of Accounts with the accountNumber as the key.
    */
        Map<String, Account> accountMap = new HashMap<>();
        Account a1 = new Account("aa", "bb", new BigDecimal(200.00), "YMZ-0035", Hold.NONE);
        Account a2 = new Account("aa", "bb", new BigDecimal(200.00), "YMZ-0035", Hold.FRAUD);
        Account a3 = new Account("aa", "bb", new BigDecimal(200.00), "YMZ-0035", Hold.DELINQUENCY);
        Account a4 = new Account("aa", "bb", new BigDecimal(200.00), "YMZ-0035", Hold.LOST_STOLEN);
        Account a5 = new Account("aa", "bb", new BigDecimal(200.00), "YMZ-0035", Hold.LITIGATION_HOLD);
        Account a6 = new Account("aa", "bb", new BigDecimal(200.00), "YMZ-0035", Hold.FREERIDING);

        accountMap.put(a1.getAccountNumber(),a1);
        accountMap.put(a2.getAccountNumber(),a2);
        accountMap.put(a3.getAccountNumber(),a3);
        accountMap.put(a4.getAccountNumber(),a4);
        accountMap.put(a5.getAccountNumber(),a5);
        accountMap.put(a6.getAccountNumber(),a6);

        for (Account a: accountMap.values()) {
            System.out.println(a.getName());
        }
        for (String key: accountMap.keySet()) {
            System.out.println(key);
        }
    }
}