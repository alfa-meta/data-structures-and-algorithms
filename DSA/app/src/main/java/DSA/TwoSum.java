/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class TwoSum {

    /**
     * ONLY WORKS if the array is sorted in ascended order
     */
    
    private static boolean TwoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return true;
            }
            
            if (sum < target){
                left++;
            }
                
            if (sum > target){
                right--;
            }
        } 
        return false;
    }
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 5, 8, 14, 22, 98};
        boolean outcome = TwoSum(arr, 55);
        System.out.println(outcome);
    }
}
