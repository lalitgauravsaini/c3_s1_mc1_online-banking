package com.OnlineBanking;

import java.util.Random;

@SuppressWarnings("ALL")
public class SavingAccount {
    Random obj=new Random();
long accountNumber;
String holderName;
double balance;
String status;
float deposit;
int withdrawlAmount;

    public SavingAccount(String lalit) {
    }


    public double withdrawl(double balance) {
return balance-withdrawlAmount;

}public long accountNumber() {
        return (long) Math.random() * 1000000000000L;
    }
public static void main(String[] args){
    System.out.println("accountNumber");
        }

    public void generateAccountNumber() {
    }
}




