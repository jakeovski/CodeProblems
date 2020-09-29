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
public class isPalindrome {

    public static void main(String args[]) {

        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        
        if(x < 0 || (x % 10 == 0 && x !=0)) {
            return false;
        }else {
            int revertedNumber = 0;
            while(x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x/= 10;
            }
            return x == revertedNumber || x == revertedNumber/10;
        }

    }
}
