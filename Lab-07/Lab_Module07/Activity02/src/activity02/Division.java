/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity02;

public class Division {

    private int number1;
    private int number2;

    public Division(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return this.number1;
    }

    public int getNumber2() {
        return this.number2;
    }

    public double Divider() {
        return (double) getNumber1() / getNumber2();
    }
}
