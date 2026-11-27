/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3;

public final class Commission {
    private String name;
    private int magazineSold;
    private final double RATE = 2.50;

    public Commission(String name, int magazineSold) {
        this.name = name;
        this.magazineSold = magazineSold;
    }

    public final double calculateCommission() {
        return magazineSold * RATE;
    }

    public void displayInfo() {
        System.out.println("Seller Name: " + name);
        System.out.println("Magazines Sold: " + magazineSold);
        System.out.printf("Commission Earned: RM %.2f\n", calculateCommission());
    }
}
