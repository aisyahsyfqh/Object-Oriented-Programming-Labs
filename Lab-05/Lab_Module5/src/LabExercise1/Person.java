/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExercise1;

public class Person {
    private String fullName;
    private String phoneNumber;

    public Person(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return fullName;
    }

    public String toString() {
        return "Name: " + fullName + "\nPhone: " + phoneNumber;
    }
}
