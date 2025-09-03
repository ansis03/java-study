package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount){
        balance = balance + amount;
        System.out.println("잔고: " + balance);
        return balance;
    }
    int withdraw(int amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("잔고: " + balance);
        }
        else{
            System.out.println("잔액 부족\n잔고: " + balance);
        }
        return balance;
    }
}
