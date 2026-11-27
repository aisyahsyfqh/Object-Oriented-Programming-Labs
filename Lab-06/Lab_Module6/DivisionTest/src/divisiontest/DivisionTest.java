
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisiontest;
import javax.swing.JOptionPane;

public class DivisionTest {
    public static void main(String[] args) {
        try {
            int dividend = Integer.parseInt(
                JOptionPane.showInputDialog("Enter dividend:")
            );

            int divisor = Integer.parseInt(
                JOptionPane.showInputDialog("Enter divisor:")
            );

            Division division = new Division(dividend, divisor);

            JOptionPane.showMessageDialog(null, division.toString());

        } catch (ArithmeticException ae) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + ae.getMessage(),
                    "ArithmeticException", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,
                    "Error: Please enter valid integers.",
                    "NumberFormatException", JOptionPane.ERROR_MESSAGE);
        }
    }
}


