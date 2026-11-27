/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcurrencyconverter;

/**
 *NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB
 *MATRIX: S74405 
 *TASK: : Writing a class with final field/instance variable data type.
 */
public class CurrencyConverter {

    private double CONVERSION_RATE = 4.320;

    private double myrRate;
    private double poundAmount;

    public CurrencyConverter(double myrRate) {
        this.myrRate = myrRate;
        this.poundAmount = convertToPounds(myrRate);
    }

    private double convertToPounds(double myr) {
        return myr / CONVERSION_RATE;
    }

    public void displayResult() {
        System.out.printf("Amount in MYR: RM%.2f\n", myrRate);
        System.out.printf("Converted to Pounds: £%.2f\n", poundAmount);
    }
}
