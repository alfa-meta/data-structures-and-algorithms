/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 * Algorithm 5: Check whether a number is prime or not.
 *
 * Step 1: Start
 * Step 2: Declare variables n, i, flag.
 * Step 3: Initialize variables
 *       flag ← 1
 *       i ← 2  
 * Step 4: Read n from the user.
 * Step 5: Repeat the steps until i=(n/2)
 *    5.1 If remainder of n÷i equals 0
 *           flag ← 0
 *           Go to step 6
 *    5.2 i ← i+1
 * Step 6: If flag = 0
 *          Display n is not prime
 *       else
 *          Display n is prime
 * Step 7: Stop 
 * @author tomas
 */
public class Introduction5 {
    public static void main(String[] args) {
        int n;
        int i = 2;
        int flag = 1;
        
        System.out.println("Input an Integer:");
        Scanner scanner = new Scanner(System.in);
        
        try {
            n = scanner.nextInt();
        } catch (NumberFormatException nfe){
            System.out.println("Input a proper Integer");
            n = 0;
            System.exit(0);
        }
        
        System.out.println("n: " + n);
        System.out.println("i: " + i);
        
        while (i != n/2){
            if (n%i == 0){
                flag = 0;
            }
            i += 1;
        }
        
        if (flag == 0){
            System.out.println("n is not Prime");
        } else {
            System.out.println("n is Prime");
        }
        
        System.out.println("Exiting Program Successfully!");
    }
}
