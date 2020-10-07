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
public class LengthOfLastWord {

    public static void main(String[] args) {

        //System.out.println(lengthOfLastWord("Hello World"));
        String s = " ";
        int first = 0;
        int count = 0;
        for (int i = 0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                first = i;
                count++;
            }
        }
        if(count < 2 && !(s.equals(" "))) {
            System.out.println(s.substring(first + 1).length());
        }else if (count >= 2 || s.equals(" ")) {
            System.out.println(0);
        }else {
            System.out.println(s.length());
        }
        

    }

    public static int lengthOfLastWord(String s) {
//        int out = 0;
//        if(s.isEmpty()) {
//            return out;
//        }else {
//            for(int i = 0; i < s.length(); i ++) {
//                if(s.charAt(i) == ' '){
//                    out = s.substring(i+1).length();
//                }
//            }
//            if (out != 0) {
//                return out;
//            }else {
//                return s.length();
//            }
//        }
    }
}
