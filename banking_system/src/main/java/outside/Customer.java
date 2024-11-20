/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package outside;

import banking_system.ATM;
import banking_system.Bank;

/**
 *
 * @author DhM
 */
public class Customer {
    private Bank patronBank;
    private ATM patronATM;
    private int currentLog;
    private int myAcc;
    
    public Customer(Bank b, ATM a)
    {
        patronBank = b;
        patronATM = a;
    }
    
    public void openAccount()
    {
        myAcc = patronBank.createAccount();
    }
    
    public void depositMoney(int amount)
    {
        patronATM.loginToAccount(myAcc);
        patronATM.deposit(amount);
        patronATM.logout();
    }
    
    public void withdrawMoney(int amount)
    {
        patronATM.loginToAccount(myAcc);
        patronATM.withdraw(amount);
        patronATM.logout();
    }
    
    public int checkBalance()
    {
        int balance;
        patronATM.loginToAccount(myAcc);
        balance = patronATM.getBalance();
        patronATM.logout();
        
        return balance;
    }
    
    public int getmyAcc()
    {
        return myAcc;
    }
}
