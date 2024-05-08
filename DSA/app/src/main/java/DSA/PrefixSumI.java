/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class PrefixSumI {

    /**
     * @param args the command line arguments
     */
    private static int PrefixSum1(int[] nums, int[][] queries, int limit){
        boolean[][] ans = {};
        int[] cumulativeSum = new int[nums.length];
        cumulativeSum[0] = nums[0];
        System.out.println(nums[0]);
        
        for (int i = 1; i < nums.length; i++){
            System.out.println("Nums: " + nums[i]);
            cumulativeSum[i] = nums[i] + cumulativeSum[i - 1];
            System.out.println(cumulativeSum[i]);
        }
        
        for (int j = 0; j < queries.length; j++){
            int a = 0;
            int b = 0;
        }
        
        return 0;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int outcome = PrefixSum1(arr, queries, 3);
        System.out.println("Outcome: " + outcome);
    }
}
