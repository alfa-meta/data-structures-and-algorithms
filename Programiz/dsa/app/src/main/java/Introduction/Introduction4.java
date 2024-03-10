/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 * Algorithm 4: Find the factorial of a number: Step 1: Start Step 2: Declare
 * variables n, factorial and i. Step 3: Initialize variables factorial ← 1 i ←
 * 1 Step 4: Read value of n Step 5: Repeat the steps until i = n 5.1: factorial
 * ← factorial*i 5.2: i ← i+1 Step 6: Display factorial Step 7: Stop
 *
 * @author tomas
 */
public class Introduction4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input integer n: ");
        int n;
        
        try {
            n = scanner.nextInt();
        } catch (NumberFormatException nfe){
            System.out.println("Please enter proper numbers.");
            n = 0;
            System.exit(0);
        }

        int factorial = 1;
        int i = 1;

        while (n >= i) {
            factorial = factorial * i;
            System.out.println("Factorial: " + factorial);
            System.out.println("i: " + i);
            
            i = i + 1;
        }
        System.out.println("End of Program");
    }
}
