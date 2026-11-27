/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity1;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape {
    private int radius;

    public Circle(String Shapename, int radius) {
        super(Shapename);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return 3.14f * radius * radius;
    }

    @Override
    public String toString() {
        return String.format ("%s\n%s %.2f\n",
                super.toString(),"Area Of The Circle =",
                calculateArea());
    }
}
