/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExercise1;

public class ExtPerson extends Person {
    private Date birthDate;
    private Address address;
    private String category;

    public ExtPerson(String fullName, String phoneNumber, 
            Date birthDate, Address address, String category) {
        super(fullName, phoneNumber);
        this.birthDate = birthDate;
        this.address = address;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String toString() {
        return super.toString() +
               "\nCategory: " + category +
               "\nBirth Date: " + birthDate +
               "\nAddress: " + address;
    }
}

