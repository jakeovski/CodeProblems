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
public class LongestCommonPrefix {

    public static void main(String args[]) {
        String[] input = {"flower","flow"};
        System.out.println(longestCommonPrefix(input));
        System.out.println(input[1].indexOf("flower"));
        
        
    }
    
    public static String longestCommonPrefix(String[] strs){
    if (strs.length == 0) {
           return "";
       }
        String first = strs[0];
        for(int i = 1;i < strs.length;i++) {
            while(strs[i].indexOf(first) != 0) {
                first = first.substring(0,first.length() -1);
                if(first.isEmpty()) {
                    return "";
                }
            }
        }
        return first;
    }
}
