/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class SlidingWindowMaxConsecutigeOnesIII {

    /**
     * @param args the command line arguments
     */
    private static int longestOnes(int[] nums, int k) {
        int sum = 0;
        int curr = 0;
        int max = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++){
            if (nums[right] == 1){
                curr += 1;
            } else {
                sum += 1;
            }
            
            while (sum > k){
                if (nums[left] == 1){
                    curr -= 1;
                } else {
                    sum -= 1;
                }
                left++;
            }
            
            
            max = Math.max(max, sum+curr);
        }
        return max;
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int outcome = longestOnes(arr, 3);
        System.out.println("Outcome: " + outcome);
    }
}
