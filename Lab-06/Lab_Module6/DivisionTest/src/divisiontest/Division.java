/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package divisiontest;

public class Division {
    private int dividend;
    private int divisor;

    public Division(int dividend, int divisor) {
        this.dividend = dividend;
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
        return "Dividend: " + dividend +
               "\nDivisor: " + divisor +
               "\nQuotient: " + getQuotient();
    }
}
