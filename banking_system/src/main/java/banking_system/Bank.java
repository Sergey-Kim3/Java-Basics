/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

import java.util.ArrayList;

/**
 *
 * @author DhM
 */
public class Bank {
    ArrayList<Account> acc = new ArrayList<>();
    ArrayList<ATM> atm = new ArrayList<>();
    private int number = 100000;
    private int accCount = 0;
    private int atmCount = 0;
    
    public int createAccount() {
        Account newAcc = new Account(number + accCount);
        acc.add(newAcc);
        accCount++;
        return newAcc.acctNum;
    }
    
    public void attachATM(ATM atm)
    {
        this.atm.add(atm);
        atm.setBank(this);
    }
    
    public int accessAcctInfo(int acctNum) throws Exception 
    {
        int Balance = 0;
     
        for(Account i: acc)
        {
            if(i.acctNum == acctNum)
                Balance = i.Balance;
        }
        if(Balance == 0) 
            throw new Exception("Requested account not found!");
        return Balance;
    }
    
    protected void updateAcctBal(int acctNum, int diff) throws Exception
    {
        int Balance = 0;
        
        for(Account i:acc)
            {
                if(i.acctNum == acctNum)
                {
                    i.Balance += diff;
                    Balance = i.Balance;
                }
            }
        if(Balance < 0) 
            throw new Exception("Update unsuccessful");
        else if(Balance == 0)
            throw new Exception("Requested account not found!");
    }

    public void updateBalance(int acctNum, int diff) throws Exception {
        updateAcctBal(acctNum, diff);
    }
}
