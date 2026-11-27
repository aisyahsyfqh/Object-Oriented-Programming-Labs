/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("=== Input 10 unique integer values ===");

        while (count < 10) {
            try {
                System.out.print("Enter value for index " + count + ": ");
                int num = input.nextInt();

                for (int i = 0; i < count; i++) {
                    if (numbers[i] == num) {
                        throw new DuplicateValueException("Duplicate value entered: " + num);
                    }
                }

                numbers[count] = num;
                count++;

            } catch (DuplicateValueException dve) {
                System.out.println("Error: " + dve.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Error: Please enter integers only.");
                input.nextLine(); 
            }
        }

        try {
            System.out.print("\nEnter index to retrieve (0–9): ");
            int index = input.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Error: Index out of bounds.");
        }

        try {
            System.out.print("\nEnter value to search (must be > 0): ");
            int searchValue = input.nextInt();
            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == searchValue) {
                    System.out.println("Value " + searchValue + " found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new NumberNotFoundException("Value " + searchValue + " not found in array.");
            }

        } catch (NumberNotFoundException nnfe) {
            System.out.println("Error: " + nnfe.getMessage());
        }
    }
}

