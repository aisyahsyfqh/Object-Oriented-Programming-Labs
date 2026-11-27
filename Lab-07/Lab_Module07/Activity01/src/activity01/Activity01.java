/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity01;

import javax.swing.JOptionPane;

public class Activity01 {

    public static void main(String[] args) {
        String number1Str = JOptionPane.showInputDialog("Enter the dividend: ");
        String number2Str = JOptionPane.showInputDialog("Enter the divisor: ");

        int number1 = Integer.parseInt(number1Str);
        int number2 = Integer.parseInt(number2Str);

        Division div = new Division(number1, number2);

        JOptionPane.showMessageDialog(
            null,
            "Dividend = " + div.getNumber1() +
            "\nDivisor = " + div.getNumber2() +
            "\nQuotient = " + div.Divider(),
            "Quotient",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
