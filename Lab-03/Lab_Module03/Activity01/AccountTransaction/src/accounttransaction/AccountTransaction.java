/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounttransaction;

/**
 *NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB
 *MATRIX: S74405 
 *TASK: : Writing a class with static field/instance variable data type.
 */
public class AccountTransaction {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Account account1 = new Account(1002, "ALI", "w", 400.00);
        account1.displayBalance();

        Account account2 = new Account(1002, "ALI", "D", 100.00);
        account2.displayBalance();

        Account account3 = new Account(1002, "ALI", "W", 600.00);
        account3.displayBalance();
    }
}