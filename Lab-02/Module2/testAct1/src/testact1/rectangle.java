/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testact1;

/**
 *
 * @author ASUS
 */
class rectangle {

    private double height;
    private double width;
    public double outSide;

    public rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.outSide = calculateOutside();
        
    }
    private double calculateOutside(){
        return height*width;
    }

}
   
