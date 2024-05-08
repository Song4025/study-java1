package oop1.ex;

import org.w3c.dom.ls.LSOutput;

public class Account {
    // 잔액
    int balance;
    int amount;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("잔액부족, 현재잔액:"+balance);
        }
    }

}
