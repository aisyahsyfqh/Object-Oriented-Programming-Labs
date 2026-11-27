/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExercise1;

public class Address {
    private String street, city, state;
    private String zipCode;

    public Address(String street, String city, 
            String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
