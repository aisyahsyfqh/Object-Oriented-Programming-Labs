/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcurrencyconverter;
import java.util.Scanner;

/**
 *NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB
 *MATRIX: S74405 
 *TASK: : Writing a class with final field/instance variable data type.
 */
public class TestCurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ecah = new Scanner(System.in);

        System.out.print("Enter amount in MYR: RM");
        double myr = ecah.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(myr);
        converter.displayResult();

    }
}

