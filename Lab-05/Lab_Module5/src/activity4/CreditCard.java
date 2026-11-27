/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4;

import java.util.ArrayList;

public class CreditCard implements Payment {
    private String cardNumber;
    private ArrayList<Transaction> transactions;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double calculatePaymentAmount() {
        double total = 0.0;
        for (Transaction t : transactions) {
            total += t.getAmount();
        }
        return total;
    }

    public void printStatement() {
        System.out.println("CREDIT CARD STATEMENT");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Transactions:");
        for (Transaction t : transactions) {
            System.out.println("  - " + t);
        }
        System.out.printf("Total Payment Due: RM %.2f\n", calculatePaymentAmount());
    }
}
