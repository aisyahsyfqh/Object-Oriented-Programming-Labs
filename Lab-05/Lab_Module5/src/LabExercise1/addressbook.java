/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LabExercise1;

/**
 *
 * @author ASUS
 */
public class addressbook {

    public static void main(String[] args) {
        ExtPerson[] people = new ExtPerson[3];

        people[0] = new ExtPerson("Aisyah", "012-3456789",
                new Date(11, 11, 2000),
                new Address("Jalan UMT", "Kuala Nerus", "Terengganu", "21030"),
                "Family");

        people[1] = new ExtPerson("syafiqah", "011-2233445",
                new Date(5, 10, 1999),
                new Address("Kampung Banggol Donas", "Kuala Terengganu", "Terengganu", "21000"),
                "Friend");

        people[2] = new ExtPerson("Encik naszryn", "013-7778888",
                new Date(13, 12, 1985),
                new Address("Bandar Saujana Putra", "Selangor", "WP", "50050"),
                "Family");

        System.out.println("=== FULL ADDRESS BOOK ===\n");
        for (ExtPerson p : people) {
            System.out.println(p);
            System.out.println("--------------------------");
        }
    }
}