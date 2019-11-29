package org.ipsd.k12.cs2019;
/**
 *  A class to test the BankAccount class.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
//BankAccount type variable = new Constructor(AcctNum, Balance)
        BankAccount acct1 = new BankAccount("111111", 10000);

 //BankAccount type variable = new Constructor()   Default
        BankAccount acct2 = new BankAccount();
        
 //BankAccount type variable = new Constructor(AcctNum, Balance)
        BankAccount acct3 = new BankAccount("123456",0.0);
        
 // print the status of each account
        System.out.println("Account #" + acct1.getAccount() + 
        		" has initial balance of $" + acct1.getBalance());

        System.out.println("Account #" + acct2.getAccount() + 
        		" has initial balance of $" + acct2.getBalance());

        System.out.println("Account #" + acct3.getAccount() + 
        		" has initial balance of $" + acct3.getBalance() + "\n");
        
        // make a deposit to account 111111
        acct1.deposit(73.76);
        
        //changes account 000000 to 222222
        acct2.setAccountNumber("222222");
        // makes a withdrawal from account 222222
        acct2.withdraw(100);
        
        //Deposits $10,000 into account 123456
        acct3.deposit(10000);
        
        
        // print the new status of each account
        System.out.println("Account #" + acct1.getAccount() + 
        		" has a new balance of $" + acct1.getBalance());

        System.out.println("Account #" + acct2.getAccount() + 
        		" has a new balance of $" + acct2.getBalance());
        
        System.out.println("Account #" + acct3.getAccount() + 
        		" has a new balance of $" + acct3.getBalance() + "\n");
        
        //Shows what account 123456 will look like after 10 years at 4.5% APR
        int year = 10;
        double rate = 4.5;
        System.out.println("Account #" + acct3.getAccount() + 
        		" after " + year + " years, at a " + rate + "% rate"
        		+ " would be: $" + acct3.interest(year, rate) + "\n");
        
    }
}

/*
Account #111111 has initial balance of $10000.0
Account #000000 has initial balance of $0.0
Account #123456 has initial balance of $0.0

Account #111111 has a new balance of $10073.76
Account #222222 has a new balance of $-100.0
Account #123456 has a new balance of $10000.0

Account #123456 after 10 years, at a 4.5% rate would be: $15683.121854901687
*/
   
