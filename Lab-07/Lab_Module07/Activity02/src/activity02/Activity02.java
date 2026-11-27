/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity02;

import javax.swing.JOptionPane;

public class Activity02 {

    public static void main(String[] args) {

        try {
            String number1Str = JOptionPane.showInputDialog("Enter the dividend: ");
            String number2Str = JOptionPane.showInputDialog("Enter the divisor: ");

            int number1 = Integer.parseInt(number1Str);
            int number2 = Integer.parseInt(number2Str);

            Division div = new Division(number1, number2);

            JOptionPane.showMessageDialog(
                    null,
                    "Dividend = " + div.getNumber1()
                    + "\nDivisor = " + div.getNumber2()
                    + "\nQuotient = " + div.Divider(),
                    "Quotient",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception arithExc) {
            JOptionPane.showMessageDialog(
                    null,
                    "Exception: " + arithExc + "\nZero is an invalid divisor",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }1
    }
}