/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author ASUS
 */
public class student{

    private String studentID;
    private String studentName;
    private String studentStatus;

    public student(String id, String name) {
        setStudentID(id);
        setStudentName(name);
        this.studentStatus = "Active"; 
    }

    public student(String id, String name, String status) {
        setStudentID(id);
        setStudentName(name);
        setStudentStatus(status);
    }

    
    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentStatus() {
        return this.studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }
}
