/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class SlidingWindowLongestBinaryString {

    private static int SlidingWindowLongestBinaryString(String s){
        int curr = 0;
        int zeroCount = 0;
        int left = 0;
        int max = 0;
        
        for ( int right = 0; right < s.length(); right++){
            if (s.charAt(right) == '1'){
                curr++;
            } else {
                zeroCount++;
            }
            
            while ( zeroCount > 1){
                if (s.charAt(left) == '0'){
                    curr--;
                    zeroCount--;
                }
                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
    
    public static void main(String args[]) {
        int outcome = SlidingWindowLongestBinaryString("100101101101");
        System.out.println(outcome);
    }
}
