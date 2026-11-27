/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity1;

public class Shape {

    private String Shapename;

    public Shape(String Shapename) {
        this.Shapename = Shapename;
    }

    public String getShapename() {
        return Shapename;
    }

    public void setName(String Shapename) {
        this.Shapename = Shapename;
    }

    public float calculateArea() {
        return 0.0f; 
    }

        @Override
    public String toString() {
        return String.format( "%s %s\n",
                "Shape name = ", getShapename());
    }
}
