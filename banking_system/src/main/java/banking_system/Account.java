/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

/**
 *
 * @author DhM
 */
public class Account {
    protected int acctNum;
    protected int Balance;

    protected Account(int acctNum) {
        this.acctNum = acctNum;
        this.Balance = 0;
    }

    protected int getBalance()
    {
        return Balance;
    }
    
    protected int getacctNum()
    {
        return acctNum;
    }
}
