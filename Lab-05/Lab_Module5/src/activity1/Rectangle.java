/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity1;

public class Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(String Shapename, int width, int length) {
        super(Shapename);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float calculateArea(){
        return (float)(3.14 * getWidth() * getLength());
    }

    public String toString() {
        return String.format("%s\n%s %.2f\n",
                super.toString(), "Area Of The Rectangle = ",
                calculateArea());
    }
}
