/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DSA;

/**
 *
 * @author striker
 */
public class TwoPointersSubsequence {

    /**
     * @param args the command line arguments
     */
    
    private static boolean Subsequence(String s, String t){
        int j = 0;
        int i = 0;
        
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            
            j++;
        }
        
        
        return i == s.length();
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        boolean outcome = Subsequence("cbo", "acabor");
        System.out.println(outcome);
    }
}
