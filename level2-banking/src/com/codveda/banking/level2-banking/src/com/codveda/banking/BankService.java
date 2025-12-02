package com.codveda.banking;

import java.util.ArrayList;

public class BankService {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount findAccount(String name) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountHolder().equalsIgnoreCase(name)) {
                return acc;
            }
        }
        return null;
    }

    public ArrayList<BankAccount> getAllAccounts() {
        return accounts;
    }
}
