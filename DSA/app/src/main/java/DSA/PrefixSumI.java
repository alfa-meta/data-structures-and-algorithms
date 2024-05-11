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
    private static boolean[] PrefixSum1(int[] nums, int[][] queries, int limit){
        boolean[] ans = new boolean[queries.length];
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        int x, y;
        int outcome;
        
        for (int i = 1; i < nums.length; i++){
            prefixSum[i] = nums[i] + prefixSum[i - 1];
            System.out.println("At i: " + i + ", " + prefixSum[i]);
        }
        
        
        for (int j = 0; j < queries.length; j++){
            x = queries[j][0];
            y = queries[j][1];
            
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            if (x > 0){
                outcome = prefixSum[y] - prefixSum[x - 1];
                System.out.println(""+prefixSum[y]+ " "+  prefixSum[x - 1]);
            } else {
                outcome = prefixSum[y];
            }
            
            if (outcome <= limit){
                ans[j] = true;
            } else {
                ans[j] = false;
            }
            System.out.println("final prefixSum " + outcome);
        }
        
        
        return ans;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        boolean[] outcome = PrefixSum1(arr, queries, 13);
        for (int p = 0; p < outcome.length; p++){
            System.out.println("Outcome p: " + outcome[p]);
        }
    }
}
