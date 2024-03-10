/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;
import java.lang.Math;
/**
 * Algorithm 3: Find Roots of a Quadratic Equation ax^2+bx+c = 0
 * Step 1: Start
 * Step 2: Declare variables n, factorial and i.
 * Step 3: Initialize variables
 *           factorial ← 1
 *           i ← 1
 * Step 4: Read value of n
 * Step 5: Repeat the steps until i = n
 *      5.1: factorial ← factorial*i
 *      5.2: i ← i+1
 * Step 6: Display factorial
 * Step 7: Stop
 * 
 * @author tomas
 */
public class Introduction3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c, D, x1, x2, rp, ip;
        
        try{
            System.out.println("Insert number a: ");
            a = scanner.nextInt();

            System.out.println("Insert number b: ");
            b = scanner.nextInt();

            System.out.println("Insert number c: ");
            c = scanner.nextInt();
        
        } catch (NumberFormatException nfe){
            System.out.println("Please enter proper numbers.");
            c = 0;
            a = 0;
            b = 0;
            System.exit(0);
        }
        
        double bSquared = Math.pow(b, 2); 
        
        D = (int)bSquared - 4*a*c;
        System.out.println("Discriminant value: " + D);
        
        if (D > 0){
            System.out.println("D > 0");
            x1 = ((b*-1) + (int)Math.sqrt(D)/(2*a));
            x2 = ((b*-1) - (int)Math.sqrt(D)/(2*a));
            System.out.println("x1 and x2 roots = [" + x1 + ", " + x2 + "]");
        } else {
            System.out.println("D < 0");
            rp = (b*-1)/(2*a);
            ip = (int) Math.sqrt((D*-1)/(2*a));
            System.out.println("Root rp+ip: " + (rp + ip));
            System.out.println("Root rp-ip: " + (rp - ip));
        }
        
        System.out.println("End of Progam!");
    }
}
