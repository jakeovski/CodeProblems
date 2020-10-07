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
public class CountAndSay {

    public static void main(String[] args) {

        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String str = "11";
        for (int i = 3; i <= n; i++) {
            str += '$';//str = "11$"   str = "21$"
            int len = str.length(); //3
            int cnt = 1;
            String tmp = "";
            char[] arr = str.toCharArray(); //arr = [1,1,$];   aarr = [2,1,$]
            for (int j = 1; j < len; j++) {
                if (arr[j] != arr[j - 1]) { //1. if (1 != 1)  2.if ($ != 1)   if(1 != 2)  if( $ != 1)
                    tmp += cnt + 0; //1. 2   2. 1  3. 121
                    tmp += arr[j - 1]; //1. 21  2.12   3. 1211
                    cnt = 1;
                } else {
                    cnt++; //1. cnt = 2
                }
            }
            str = tmp; //1.21
        }
        return str;
    }

}
