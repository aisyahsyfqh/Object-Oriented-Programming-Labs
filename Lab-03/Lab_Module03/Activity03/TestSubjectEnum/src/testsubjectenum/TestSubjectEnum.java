/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testsubjectenum;

/**
 * NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB 
 * MATRIX: S74405 
 * TASK: :Implement enumeration concept for listing of subject.
 */
public class TestSubjectEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== All Subjects ===");
        for (Subject sub : Subject.values()) {
            System.out.println(sub + ": " + sub.getSubjectName()
                    + " (" + sub.getCourseName() + ")");
        }

        System.out.println("\n=== subject between subject code CSF3143 to CSE433 ===");
        for (Subject sub : Subject.values()) {
            if (sub.name().startsWith("CSF") || sub.name().startsWith("CSE")) {
                System.out.println(sub + ": " + sub.getSubjectName());
            }
        }

        System.out.println("\n=== subject code CSE3203 and CSE3413 ===");
        System.out.println(Subject.CSE3203 + ": " + Subject.CSE3203.getSubjectName());
        System.out.println(Subject.CSE3413 + ": " + Subject.CSE3413.getSubjectName());
    }
}
