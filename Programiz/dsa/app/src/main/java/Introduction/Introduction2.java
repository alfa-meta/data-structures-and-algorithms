/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 *  Given an input of three numbers find the largest number among three numbers.
 *  Step 1: Start
 *  Step 2: declare variables a, b and c.
 *  Step 3: Read variables a, b and c.
 *  Step 4: If a > b
 *              If a > c
 *                  Display a is the largest number.
 *              Else
 *                  Display c is the largest number.
 *          Else
 *              If b > c
 *                  Display b is the largest number.
 *              Else 
 *                  Display c is the greatest number.
 *  Step 5: Stop
 * 
 * @author tomas
 */
public class Introduction2 {
    int num1, num2, num3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter Number a: ");
        String num1 = scanner.nextLine();
        
        System.out.println("Enter Number b: ");
        String num2 = scanner.nextLine();
        
        System.out.println("Enter Number c: ");
        String num3 = scanner.nextLine();
        
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int c = Integer.parseInt(num3);
            
            if (a > b){
                if (a > c){
                    System.out.println("a is the largest number");
                } else {
                    System.out.println("c is the largest number");
                }
            } else {
                if (b > c){
                    System.out.println("b is the largest number");
                } else {
                    System.out.println("c is the largest number");
                }
            }
            
        } catch (NumberFormatException nfe){
            System.out.println("Please enter proper numbers.");
        }
        
        System.out.println("End of Program!");
    }
}
