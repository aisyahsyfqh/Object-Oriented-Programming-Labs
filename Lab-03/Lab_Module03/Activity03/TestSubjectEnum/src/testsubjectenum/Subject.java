package testsubjectenum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB
 *MATRIX: S74405 
 *TASK: :Implement enumeration concept for listing of subject.
 */
public enum Subject {
    CSF3143("Software Engineering Basic", "BCS(SE)"),
    CSE3203("Software Requirements Engineering", "BCS(SE)"),
    CSE3433("Software Architecture", "BCS(SE)"),
    CSE3413("Software Testing", "BCS(SE)"),
    MMM3763("Principle of Maritime Management", "BSC(IM)"),
    CSA3003("Maritime Informatics Technology and Application", "BSC(IM)");

    private String subName;
    private String courseName;

    Subject(String subjectName, String courseName) {
        this.subName = subjectName;
        this.courseName = courseName;
    }

    public String getSubjectName() {
        return subName;
    }

    public String getCourseName() {
        return courseName;
    }
}
