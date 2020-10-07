/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SixthKyu;

import java.util.ArrayList;

/**
 *
 * @author Jakeovski
 */
public class OddInEven {

    public static void main(String[] args) {

        int[] integers = {2, 4, 0, 100, 4, 11, 2602, 36};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer i : integers) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        if (even.size() == integers.length - 1) {
            System.out.println(odd.get(0));
        } else {
            System.out.println( even.get(0));
        }
    }
}
