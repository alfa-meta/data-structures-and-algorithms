/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

/**
 *
 * @author tomas
 */
public class SimpleClass {
    public static void main(String[] args) {
        long sum = 0;
        
        for (long i = 0; i < 1000000000; i++){
            sum += i;
            System.out.println(sum);
        }
    }
}
