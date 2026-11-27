/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity3;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date hire = new Date (01, 05, 2023); 
        Employee employee = new Employee("EMP001", "Ali Bin Abu", hire); 

        System.out.println(employee);
    }
}