/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

public class JavaConsultant extends Consultant {

    private int workingDays;
    private final float RATE = 800.0f;

    public JavaConsultant(String name, String company, int age, int workingDays) {
        super(name, company, age);
        this.workingDays = workingDays;
    }

    @Override
    public void calculateSalary() {
        float salary = workingDays * RATE;
        System.out.printf("Salary = RM %.2f\n", salary);
    }
}
