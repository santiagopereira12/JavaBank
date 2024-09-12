package com.project.bank;

public class Account {

    private double balance;

    public Account(){
        this.balance = 5000000;
    }

    public void getAccount(){
        System.out.println("Su saldo es de $ " + this.balance);
    }

    public void WithDrawMoney(double amount){
        if (amount > balance){
            System.out.println("Saldo insuficiente");
        }else{
            balance -= amount;
            System.out.println("Usted retiro: $"+amount);
            System.out.println("Su saldo es de $ " + balance);
        }
    }

    public void DepositMoney(double amount){
        balance += amount;
        System.out.println("Usted hizo un deposito de: $"+amount);
        System.out.println("Su saldo es de $ " + balance);
    }
}
