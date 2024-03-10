/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

/**
 * Algorithm6 : Find the Fibonacci series till the term less than 1000
 * Step 1: Start 
 * Step 2: Declare variables first_term,second_term and temp. 
 * Step 3: Initialize variables first_term ← 0 second_term ← 1 
 * Step 4: Display first_term and second_term 
 * Step 5: Repeat the steps until second_term ≤ 1000 
 *    5.1: temp ← second_term 
 *    5.2: second_term ← second_term + first_term 
 *    5.3: first_term ← temp 
 *    5.4: Display second_term 
 * Step 6: Stop
 * 
 * @author tomas
 */
public class Introduction6 {
    public static void main(String[] args) {
        System.out.println("Fib1000");
        int temp;
        
        int first_term = 0;
        int second_term = 1;
        
        System.out.println(first_term);
        System.out.println(second_term);
        
        while (second_term <= 1000){
            temp = second_term;
            second_term += first_term;
            first_term = temp;
            System.out.println(temp);
        }   
        
        System.out.println("End of Program!");
        System.out.println("End of Fib1000");
        System.out.println("End of Introduction");
    }
    
}
