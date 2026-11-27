/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity1;

public class ShapeTest {

    public static void main(String[] args) {
        Circle objCircle = new Circle("Circle", 4);
        Rectangle objRectangle = new Rectangle("rectangle", 2, 4);
        Shape myShape[] = new Shape[2];

        myShape[0] = objCircle;
        myShape[1] = objRectangle;

        System.out.println("Processing the shape polymorphicaly....!");
        System.out.print("");

        for (Shape currentShape : myShape) {
            if (currentShape instanceof Rectangle) {
                Rectangle myRectangle = (Rectangle) currentShape;
                myRectangle.setLength(6);
                System.out.println(myRectangle);
            } else {
                System.out.println(currentShape);
            }
        }
    }
}
