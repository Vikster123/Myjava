package org.ipsd.k12.cs2019;
//AP CS A Pd 7
//BankAccount Class

//Patrick Fox
//Nov 6 (Edited Nov 6)
//Complete the BankAccount Class given below.

//BankAccount.java
//Java

//BankAccountTest.java
//Java
//Class comments

// File: BankAccount.java

// The BankAccount class provides a blueprint to a bank account.
// A bankAccount has an AccountNum and Balance
// You can withdraw or deposit money into the account

// You will create:
//   1. 2 private instance variables
//   2. 3 constructors (2 parameterized, 1 default) 
//   3. 2 accessor and 3 mutator methods
//	 4. Challenge: Write a method to return your money compounded continuously.
//
//*****************************************************************************

/**
 * A class to represent a bank account with an account number and a balance
 * that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
    /** Instance Field */
				private String accountNumber;
				private double myBalance;
				
				
    public BankAccount(String accountNumber, double myBalance)          // Constructor
    {
            this.accountNumber = accountNumber;
            this.myBalance = myBalance;
    }
     
    public BankAccount ()                                             // Constructor
    {					
    	this("00000",0.0);
    				//accountNumber = "000000";
    				//myBalance = 0.0;                    
    }

 //****************************************************************************
  
    public String getAccount()    //getter" method
    {
       	return accountNumber;
    }

    /**
     *  @return the balance
     */
    public double getBalance()     //accesser/getter" method
    {
      	return myBalance;
    }
    
    /**
     *  Sets the Account Number to acctNum
     *  @param acctNum is the new account Number
     */
    public void setAccountNumber(String acctNum) //"mutator/setter" method
    {											 
    	  	accountNumber = acctNum;
    }
    
    /**
     *  Deposits money into the bank account.
     *  @param amount is the amount to be deposited
     */
    public void deposit(double amount)      //"mutator/setter" method
    {
    		myBalance += amount;									
    }

    /**
     *  Withdraws money from the bank account.
     *  @param amount is the amount to be withdrawn
     */
    public void withdraw(double amount)     //"mutator/setter" method
    {
      	myBalance -= amount;
    }
    
    /**
     *  returns the amount of money that would be in your account after so many years at a certain rate.
     *  Interest is compounded continuously with years and percent rate.
     *  @param year is the amount of years your money will collect interest.
     *  @param rate is the interest percentage rate your bank will give you.
     */
    public double interest(int years, double rate)     // getter method
    {
      	return   myBalance * ( Math.pow( 1 + rate / 100 , years) ) ; 
    }
    
   

 
 }
//******************** end of BankAccount class  ********************************


