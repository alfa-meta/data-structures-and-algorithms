/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class SlidingWindowFindMaxAverage {

    /**
     * @param args the command line arguments
     */
    private static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double average = 0;
        double max = 0;
        double sum = 0;
        int rl = 0;
        
        for (int right = 0; right < nums.length; right++){
            sum += nums[right];
            System.out.println("Right " + right);
            System.out.println("Left " + left);
            rl = right - left + 1;
            System.out.println(rl);
            System.out.println(sum);

            if (rl == k){
                average = sum / k;
                sum -= nums[left];
                left++;
            }
            System.out.println("Average: " + average);
            max = Math.max(max, average);
        }
        
        return max;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {1, 12, -5, -6, 50, 3};
        double outcome = findMaxAverage(arr, 4);
        System.out.println("Outcome: " + outcome);
    }
}
