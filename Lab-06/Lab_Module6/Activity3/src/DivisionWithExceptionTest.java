
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

public class DivisionWithExceptionTest {
    public static void main(String[] args) {
        boolean continueLoop = true;
        Division division = new Division();
        
        while (continueLoop) {
            try {
                int dividend = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter dividend: ")
                );

                int divisor = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter divisor: ")
                );

                division.setDividend(dividend);
                division.setDivisor(divisor);
                int result = division.getQuotient(); 

                JOptionPane.showMessageDialog(null,
                        "Dividend: " + division.getDividend() +
                        "\nDivisor: " + division.getDivisor() +
                        "\nQuotient: " + result);

                continueLoop = false; 

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, nfe.toString(),
                        "NumberFormatException", JOptionPane.ERROR_MESSAGE);
            } catch (DivisionByZeroException dze) {
                JOptionPane.showMessageDialog(null, dze.getMessage(),
                        "DivisionByZeroException", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

