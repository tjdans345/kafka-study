package com.example.kafkastudy;// AccountTest.java

// withdraw 출금
// deposit 입금
// balance 잔고

public class AccountTest
{   //final static int MIN_Balance = 0;
    public static void main(String[] args)
    {
        Account acct = new Account(1111, 100);

        System.out.println("Account No = "+acct.getAcctNo()+", Balance = "+acct.getBalance());
        acct.deposit(20);
        System.out.println("Account No = "+acct.getAcctNo()+", Balance = "+acct.getBalance());
        acct.withdraw(30);
        System.out.println("Account No = "+acct.getAcctNo()+", Balance = "+acct.getBalance());
        acct.withdraw(200);
        System.out.println("Account No = "+acct.getAcctNo()+", Balance = "+acct.getBalance());


    }
}

class Account
{
    private int acctNo;
    private int balance;

    public Account(int no, int bal)
    {
        acctNo = no;
        balance = bal;


    }
    public int getAcctNo()  { return acctNo; }
    public int getBalance() {
        if(balance < 0 ) {
            System.out.println("현재 계좌에 잔액이 마이너스입니다.");
            return 0;
        }
            return balance;
    }

    public String toString() {
        return "Account No = " + this.balance +   " balance =" + this.balance;
    }


    public void deposit(int amt)

    {
        if(amt > 0)
            balance += amt;

    }


    public void withdraw(int amt) {
        final int MIN_Balance = 0;

        if (this.balance < amt ) {
            System.out.println("잔액이 부족합니다. 출금이 취소됩니다.");
        } else if(amt == 0) {
            System.out.println("입력값을 다시 확인해 주세요! ");
        } else {
            System.out.println(amt + "원을 출금했습니다. 현재 계좌의 잔액은 " + (this.balance - amt) + "입니다. "  );
        }

    }
}