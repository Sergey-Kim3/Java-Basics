/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package outside;

import banking_system.ATM;
import banking_system.Bank;

/**
 *
 * @author DhM
 */
public class Tester {

    public static void main(String[] args) {
        Bank Kaspi = new Bank();
        ATM BankomatOne = new ATM();
        ATM BankomatTwo = new ATM();
        
        Kaspi.attachATM(BankomatOne);
        Kaspi.attachATM(BankomatTwo);
        
        Customer Andre = new Customer(Kaspi, BankomatOne);
        Customer Billy = new Customer(Kaspi, BankomatTwo);
        
        Andre.openAccount();
        System.out.println("Andre's current balance is " + Andre.checkBalance());
        
        Andre.depositMoney(500);
        System.out.println("Andre's current balance is " + Andre.checkBalance());
        
        Andre.withdrawMoney(400);
        
        try
        {   
            int balance;
            balance = Kaspi.accessAcctInfo(Andre.getmyAcc());
            System.out.println("Andre's current balance is " + balance);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        Billy.openAccount();
        System.out.println("Billy's current number is " + Billy.getmyAcc());
        Billy.depositMoney(150);
        System.out.println("Billy's current balance is " + Billy.checkBalance());
        
        try
        {   
            int balance;
            Kaspi.updateBalance(Billy.getmyAcc(), -220);
            balance = Kaspi.accessAcctInfo(Billy.getmyAcc());
            System.out.println("Billy's current balance is " + balance);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        BankomatTwo.loginToAccount(Billy.getmyAcc());
        System.out.println("Billy's current balance accessed through ATM is " + BankomatTwo.getBalance());
    }
}
