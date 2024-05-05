/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class SquaresOfASortedArray {

    /**
     * @param args the command line arguments
     */
    
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--){
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }

            
            result[i] = square * square;
        }
        return result;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {-5, 1, 2, 4, 9};
        int[] outcome = sortedSquares(arr);
        for (int i = 0; i < outcome.length; i++){
            System.out.println(outcome[i]);
        }
    }
}
