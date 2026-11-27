/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

public abstract class Consultant {
    private String name;
    private String company;
    private int age;

    public Consultant(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }

    public void displayDetails(int age) {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Age: " + age);
    }

    public abstract void calculateSalary();
}
