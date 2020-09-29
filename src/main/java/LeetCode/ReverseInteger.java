/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Jakeovski
 */
public class ReverseInteger {

    public static void main(String args[]) {

        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        try {
           String s = Integer.toString(x);
            String reverse = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(s.length() - 1 - i) != '-') {
                    reverse += s.charAt(s.length() - 1 - i);
                } else {
                    reverse = "-" + reverse;
                }
            }
            return Integer.parseInt(reverse); 
        }catch(Exception e) {
            return 0;
        }
        
        
        


    }
}
