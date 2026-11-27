/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2;

public class TestConsultant {

    public static void main(String[] args) {
        JavaConsultant jc = new JavaConsultant("Aisyah", "UMT Sdn Bhd", 23, 20);

        System.out.println("--- Consultant Details (Without Age) ---");
        jc.displayDetails(); 

        System.out.println("\n--- Consultant Details (With Age) ---");
        jc.displayDetails(27); 

        System.out.println("\n--- Consultant Salary ---");
        jc.calculateSalary();
    }
}
