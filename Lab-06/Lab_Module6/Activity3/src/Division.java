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

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public int getQuotient() throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException
        ("Cannot divide by zero using custom exception.");
        }
        return dividend / divisor;
    }

    @Override
    public String toString() {
        return "Dividend: " + dividend +
               "\nDivisor: " + divisor;
    }
}


