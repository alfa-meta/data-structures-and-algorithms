/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class SlidingWindowFixedSize {

    /**
     * @param args the command line arguments
     */
    private static int SlidingWindowFixedSize(int[] nums, int k){
        if (k < 1){
            return 0;
        }
      
        int curr = 0;
        int max = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length;right++){
            int rl = right - left;
            System.out.println(rl);
            curr += nums[right];
            if (rl >= k) {
                curr -= nums[left];
                left++;
            }
            
            System.out.println("Current: " + curr);
            max = Math.max(max, curr);
        }
        
        
        return max;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {3, -1, 4, 12, -8, 5, 6};
        int outcome = SlidingWindowFixedSize(arr, 4);
        System.out.println("Outcome: " + outcome);
    }
}
