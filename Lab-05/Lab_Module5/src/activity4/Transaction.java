/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return date + " | " + description + " | RM " + String.format("%.2f", amount);
    }
}
