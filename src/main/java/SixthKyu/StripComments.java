/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SixthKyu;

import java.util.Arrays;

/**
 *
 * @author Jakeovski
 */
public class StripComments {

    public static void main(String[] args) {
        String text = "e\n\nab\n\nd\n\nff!cc\n\ne\n\n!\n\nb\n\nd\n\nf\n\nbd\ne\n\n\neebb\n\n\ndad\n\n\ne!b\n\nca!\n\n\nfebc\n\nbceba\n\n!\n\ncbef\n\nde\n\nd\n\nb\n\nce\n\ne\n\ne\n\n\ndfa\n\n\n\n\nd\n\n!\n\n\n\n\n\n\n\n \n\n  \n\n   \n\n \n\n \n\n\n!!ca\n \n\n \n";
        String[] commentSymbols = {"#", "$", "!", "-"};
        String sub = "";
        if (text.length() == 1) {
          if (text.charAt(0) == commentSymbols[0].charAt(0)) {
            sub = "";
          }
        }
        String[] splitted = text.split("\n");
        String[] splitted2;
        for (int i = 0; i < splitted.length; i++) {
            int count = 0;
            for (int j = 0; j < commentSymbols.length; j++) {
                if (splitted[i].contains(commentSymbols[j])) {
                    count++;
                    splitted2 = splitted[i].split("\\" + commentSymbols[j]);
                    //System.out.println(Arrays.toString(splitted2));
                    if (i == 0) {
                        sub += splitted2[0].trim();
                    }else {
                        sub += "\n" + splitted2[0].trim();
                    }
//                    System.out.println(sub);
                }
            }
//            if (count == 0) {
//                sub += "\n" + splitted[i].stripTrailing();
//            }
        }
        System.out.println(sub);
        

        //String str = "d $e f g";
       // System.out.println(Arrays.toString(str.split("\\$")));

//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == commentSymbols[0].charAt(0)) {
//                firstIndex = i - 1;
//            }else if (text.charAt(i) == commentSymbols[1].charAt(0)) {
//                thirdIndex = i - 1;
//            }else if(text.charAt(i) == '\n' && secondIndex == 0) {
//                secondIndex = i;
//            }
//        }
//        System.out.println(text.substring(0,firstIndex) + text.substring(secondIndex,thirdIndex));
    }
}

//        char[] arr = text.substring(firstIndex, thirdIndex).toCharArray();
//        for (int j = 0; j< arr.length;j++) {
//            if(arr[j] == '\n') {
//                sub = text.substring(j + j -1 , thirdIndex);
//                
//                break;
//            }
//        }
