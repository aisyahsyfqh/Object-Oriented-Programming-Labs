/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttransaction;

/**
 *NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB
 *MATRIX: S74405 
 *TASK: : Writing a class with static field/instance variable data type.
 */
public class Account {
    private int accNumber;
    private String PersonInCharge;
    private String Transactiontype;
    private double withdraw;
    private double debit;

    private static double balance = 1000.00;
    private static int transactionNo = 0;

    public Account() {
    }

    public Account(int accountNum, String PersonInCharge, String transaction, double amount) {
        transactionNo++;
        setaccNumber(accountNum);
        setPersonInCharge(PersonInCharge);
        setTransactiontype(transaction);

        if (getTransactiontype().equalsIgnoreCase("D")) {
            setBalance(getBalance() + amount);
        } else if (getTransactiontype().equalsIgnoreCase("W")) {
            setBalance(getBalance() - amount);
        }
    }

    public int getaccNumber() {
        return this.accNumber;
    }

    public void setaccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getPersonInCharge() {
        return this.PersonInCharge;
    }

    public void setPersonInCharge(String PersonInCharge) {
        this.PersonInCharge = PersonInCharge;
    }

    public String getTransactiontype() {
        return this.Transactiontype;
    }

    public void setTransactiontype(String Transactiontype) {
        this.Transactiontype = Transactiontype;
    }

    public static double getBalance() {
        return Account.balance;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }

    public static int gettransactionNo() {
        return Account.transactionNo;
    }

    public static void settransactionNo(int transactionNo) {
        Account.transactionNo = transactionNo;
    }

    public void displayBalance() {
        System.out.println("______________________");
        System.out.printf("Account Number = %d\n", getaccNumber());
        System.out.printf("Person In-Charge = %s\n", getPersonInCharge());
        System.out.printf("Transaction No = %d\n", gettransactionNo());
        System.out.printf("Balance = RM%.2f\n", getBalance());
        System.out.println(" ");
    }
}