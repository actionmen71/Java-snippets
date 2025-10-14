package com.krishna.OOPs;

public class BankAccount {

    private long accountNumber;
    private double balance;

    BankAccount(long ac){
        this.accountNumber = ac;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

   public void deposit(double amount){
        if (amount < 0){
            System.out.println("Invalid Amount!!!");
        }
        else {
            balance += amount;
            System.out.println("Deposited "+amount+" Current balance: "+balance);
        }


   }
   public void withdraw(double amount){
        if(amount > 0 && amount <= balance ){
            balance -= amount;
            System.out.println("Withdrew "+ amount+" Current balance: "+balance);
        }
        else {
            System.out.println("Invalid amount or Insufficient balance...");
        }
   }

}

/*
💡 Rule of thumb:
If all fields are optional or can change later → setters are enough.
If certain fields must exist when the object is created → use a parameterized constructor.*/

/* Constructor for Bank account
No constructor for balance, default balance is 0.
No setter for account number, account number can't be changed once created.
No setter for balance.
Getter for account number.
Getter for balance.
Withdraw and deposit method are the only ways to interact with balance.
 */