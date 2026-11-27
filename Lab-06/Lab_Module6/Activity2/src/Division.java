/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ASUS
 */
public class Division {
    private int dividend;
    private int divisor;

    public Division() {
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getQuotient() {
        return dividend / divisor;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }
    @Override
    public String toString() {
        return "Dividend: " + dividend + "\nDivisor: " + 
                divisor + "\nQuotient: " + getQuotient();
    }
}

