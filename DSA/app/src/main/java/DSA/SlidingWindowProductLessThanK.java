/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

import java.util.Arrays;

/**
 *
 * @author striker
 */
public class SlidingWindowProductLessThanK {

    /**
     * @param args the command line arguments
     */
    private static int SlidingWindowProductLessThanK(int[] arr, int k) {
        if (k <= 1){
            return 0;
        }
        
        int left = 0;
        int curr = 1;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            curr *= arr[right];

            while (curr >= k) {
                curr /= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String args[]) {
        int k = 0;
        int[] arr = {10, 5, 2, 6, 7};
        int outcome = SlidingWindowProductLessThanK(arr, k);
        System.out.println("Final Outcome: " + outcome);
    }
}
