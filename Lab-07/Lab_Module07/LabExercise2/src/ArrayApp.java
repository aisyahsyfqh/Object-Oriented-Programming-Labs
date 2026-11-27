/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        while (count < 10) {
            try {
                System.out.print("Enter an integer value: ");
                int value = scanner.nextInt();

                for (int i = 0; i < count; i++) {
                    if (numbers[i] == value) {
                        throw new DuplicateValueException("Duplicate value detected: " + value);
                    }
                }

                numbers[count] = value;
                count++;
            } catch (DuplicateValueException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        try {
            System.out.print("Enter index (0-9) to retrieve value or any value > 0 to search: ");
            int input = scanner.nextInt();

            if (input >= 0 && input < 10) {
                System.out.println("Value at index " + input + " is " + numbers[input]);
            } else {
                boolean found = false;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == input) {
                        System.out.println("Value " + input + " found at index " + i);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    throw new NumberNotFoundException("Value " + input + " not found in array.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } catch (NumberNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
