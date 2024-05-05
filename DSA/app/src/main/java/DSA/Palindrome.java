/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class Palindrome {

    private static boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        
        while (left < right){
            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }    
        return true;
    }
    
    public static void main(String args[]) {
        boolean outcome = isPalindrome("abacusucaba");
        System.out.println(outcome);
    }
}
