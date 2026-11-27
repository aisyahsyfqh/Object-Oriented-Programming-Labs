/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2;

/**
 *
 * @author ASUS
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        student obj1Student = new student("S123", "Ali", "Not active");
        student obj2Student = new student("S124", "Aisyah", "Active");

        System.out.println("STUDENT ID : " + obj2Student.getStudentID());
        System.out.println("STUDENT NAME : " + obj2Student.getStudentName());
        System.out.println("STUDENT STATUS : " + obj2Student.getStudentStatus());
    }
}