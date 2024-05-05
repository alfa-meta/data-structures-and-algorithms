/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author striker
 */
public class TwoSumArrays {

    /**
     * @param args the command line arguments
     */
    
    private static List TwoSum(int[] arr1, int[] arr2){
        int left = 0;
        int right = 0;
        List<Integer> ans = new ArrayList<>();
        
        while (left < arr1.length && right < arr2.length){
            if (arr1[left] < arr2[right]){
                ans.add(arr1[left]);
                left++;
            } else {
                ans.add(arr2[right]);
                right++;
            }
        }
        
        while ( left < arr1.length) {
            ans.add(arr1[left]);
            left++;
        }
            
        while ( right < arr2.length) {
            ans.add(arr2[right]);
            right++;
        }
        
        return ans;
    }
    
    public static void main(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {2, 6, 13, 21};
        List<Integer> outcome = TwoSum(arr1, arr2);
        System.out.println(outcome);
    }
}
