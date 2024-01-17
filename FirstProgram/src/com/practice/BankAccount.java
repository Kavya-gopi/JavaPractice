package com.practice;

/*Create a class called 'BankAccount' with attributes 'accountNumber' and 'balance'.
Include methods called 'deposit()' and 'withdraw()' that modify the balance accordingly. Create an object of the 'BankAccount' class and test the 'deposit()' and 'withdraw()' methods.
*/

public class BankAccount{
    private long accountNumber;
    private double balance;

    public BankAccount(){

    }
    public BankAccount(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }

    public double deposit(int amount){
        this.balance+=amount;
        return this.balance;

    }
    public double withDraw(int amount){
        this.balance-=amount;
        return this.balance;

    }


}


