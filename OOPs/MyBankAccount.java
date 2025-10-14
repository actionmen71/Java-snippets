package com.krishna.OOPs;

public class MyBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(4423);
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        account1.deposit(75000);
        account1.withdraw(300);
        account1.withdraw(-400);
        account1.withdraw(2100);
        System.out.println(account1.getBalance());
    }
}
