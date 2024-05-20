/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class PrefixSumSplitArray {

    /**
     * @param args the command line arguments
     */
    private static int prefixSumSplitArray(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int numberOfWays = 0;
        
        for (int i=1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
            System.out.println("prefix[i]: " + prefix[i]);
        }
        
        int comparison;
        for (int x = 0; x < (nums.length - 1); x++){
            comparison = prefix[nums.length-1] - prefix[x];
            System.out.println("comparison: " + comparison);
            if (prefix[x] >= comparison){
                numberOfWays++;
            }
        }
        
        return numberOfWays;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] nums = {10, 4, -8, 7};
        int outcome = prefixSumSplitArray(nums);
        System.out.println("Final outcome: " + outcome);
    }
}
