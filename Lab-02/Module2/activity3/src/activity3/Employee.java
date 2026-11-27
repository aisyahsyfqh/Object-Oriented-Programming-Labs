/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3;
import java.util.Date;
/**
 *
 * @author ASUS
 */

public class Employee {
    private String employeeid;
    private String name;
    private Date hiredate;

    public Employee(String employeeid, String name, Date hiredate) {
        setEmployeeid(employeeid);
        setName(name);
        setHiredate(hiredate);
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getEmployeeid() {
        return this.employeeid;
    }

    public String getName() {
        return this.name;
    }

    public Date getHiredate() {
        return this.hiredate;
    } 

    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Hire Date: %s",
                getEmployeeid(), getName(), getHiredate().toString());
    }
}
