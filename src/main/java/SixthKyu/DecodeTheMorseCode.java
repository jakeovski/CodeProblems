package SixthKyu;

import java.util.ArrayList;
import java.util.Arrays;

public class DecodeTheMorseCode {

    public static void main(String args[]) {

        System.out.println(decode(".... . -.--   .--- ..- -.. ."));

    }

    /*
    In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

For example:
     */
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String output = "";
        String[] splitted = morseCode.split("   ");

        //return Arrays.toString(splitted);
        for (int i = 0; i < splitted.length; i++) {
            String[] letters = splitted[i].split(" ");
            for (String l : letters) {
                if (MorseCode.get(l) != null) {
                    output += MorseCode.get(l);
                }
            }
            if (i != splitted.length - 1) {
                output += " ";
            }
        }
        for (int n = 0; n < output.length(); n++) {
            String output2 = "";
            if (output.charAt(0) == ' ') {
                output2 = output.substring(1);
                output = output2;
            }
        }
        return output;

    }

    /*
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
     */
}
