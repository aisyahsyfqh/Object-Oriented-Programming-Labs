/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MydivisionByZeroException extends Exception {
    public MydivisionByZeroException(){
        super("Cannot divide by zero. ");
    }
        public MydivisionByZeroException(String msg){
            super(msg);
    }   
}
