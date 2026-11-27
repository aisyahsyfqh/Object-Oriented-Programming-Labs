
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class DivisionWithExceptionTest {
    public static void main(String[] args) {
        boolean continueLoop = true;
        Division division = new Division();

        while (continueLoop) {
            try {
                int dividend = Integer.parseInt
                (JOptionPane.showInputDialog("Enter dividend: "));
                int divisor = Integer.parseInt
                (JOptionPane.showInputDialog("Enter divisor: "));

                division.setDividend(dividend);
                division.setDivisor(divisor);

                JOptionPane.showMessageDialog(null, division.toString());

                continueLoop = false;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, nfe.toString(),
                        "NumberFormatException", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(null, ae.toString(),
                        "ArithmeticException", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
