/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class SlidingWindowSumOfK {

    private static int SlidingWindowSumOfK(int[] nums, int k) {
        int curr = 0, left = 0, max = 0;
        for (int right = 0; right < nums.length; right++) {
            System.out.println("Right: " + right);
            System.out.println("Left: " + left);
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }
            System.out.println("Curr: " + curr);
            if (curr > max) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }

    public static void main(String args[]) {
        // TODO code application logic here

        int[] arr = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int outcome = SlidingWindowSumOfK(arr, 13);
        System.out.println("Max Length: " + outcome);
    }
}
