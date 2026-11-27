/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity4;

public class TestPayment {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("1234-5678-9012-3456");

        card.addTransaction(new Transaction("2025-06-01", "Shopee purchase", 120.50));
        card.addTransaction(new Transaction("2025-06-10", "Lazada payment", 88.00));
        card.addTransaction(new Transaction("2025-06-15", "Grab ride", 15.25));

        card.printStatement();
    }
    
    
}
