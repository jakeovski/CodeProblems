/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;

/**
 *
 * @author Jakeovski
 */
public class ConvertStringToCamelCase {

    public static void main(String[] args) {

        String s = "the_stealth_warrior";
        String ret = "";
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                indexes.add(i);
            }
        }
        for (int j = 0; j <= indexes.size(); j++) {
            if (j == 0) {
                ret += s.substring(0, indexes.get(j));
            } else if (j == indexes.size()) {
                String sub = s.substring(indexes.get(j - 1) + 2);
                char c = s.charAt(indexes.get(j - 1) + 1);
                ret += Character.toUpperCase(c) + sub;
            } else {
                String sub = s.substring(indexes.get(j - 1) + 2, indexes.get(j));
                char c = s.charAt(indexes.get(j - 1) + 1);
                ret += Character.toUpperCase(c) + sub;
            }

        }
        System.out.println(ret);

    }
}
