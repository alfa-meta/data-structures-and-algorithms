/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;


/**
 *  The following code is from  Programiz Introduction tutorial Algorithm 1.
 *  In it this is the problem to be solved:
 *      Step 1: Start
 *      Step 2: Declare variables num1, num2 and sum. 
 *      Step 3: Read values num1 and num2. 
 *      Step 4: Add num1 and num2 and assign the result to sum.
 *              sum←num1+num2 
 *      Step 5: Display sum 
 *      Step 6: Stop
 * 
 * @author tomas
 */
public class Introduction1 {
    public static void main(String[] args) {
        
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.println("Enter num1: ");
        String num1 = scannerObject.nextLine();
        
        System.out.println("Enter num2: ");
        String num2 = scannerObject.nextLine();
        
        try{
            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            System.out.println(sum);
        } catch (NumberFormatException nfe){
            System.out.println("Numbers could not be correctly formatted.");
        }
        
        System.out.println("End of Program!");
    }
}
