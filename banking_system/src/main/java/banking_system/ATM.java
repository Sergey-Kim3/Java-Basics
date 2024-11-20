/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

/**
 *
 * @author DhM
 */
public class ATM {
    Bank reference;
    int currentLogin;
    
    public boolean loginToAccount(int acctNum)
    {
        for(Account i:reference.acc)
        {
            if(i.acctNum == acctNum)
            {
                currentLogin = acctNum;
                return true;
            }
        }
        return false;
    }
    
    public boolean deposit(int amount) {
        try {
            if (currentLogin != 0) {
                reference.updateAcctBal(currentLogin, amount);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean withdraw(int amount) {
        try {
            if (currentLogin != 0) {
                reference.updateAcctBal(currentLogin, -amount);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public int getBalance() {
        try {
            if (currentLogin != 0) {
                return reference.accessAcctInfo(currentLogin);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public void logout()
    {
        currentLogin = 0;
    }
    
    public void setBank(Bank b)
    {
        reference = b;
    }
}
