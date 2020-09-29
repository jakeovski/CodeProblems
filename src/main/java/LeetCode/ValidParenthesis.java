/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Jakeovski
 */
public class ValidParenthesis {
    
    
    
    public static void main(String args[]) {        
      
        
        
        
    }

    public HashMap<Character, Character> mappings;

    public ValidParenthesis() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mappings.containsKey(c)) {

                Character topElement = '#';
                if (!stack.isEmpty()) {
                    topElement = stack.pop();
                }
                if (topElement != mappings.get(c)) {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

/*
    Input: s = "()[]{}"
    1.          ^
    2 if HashMap has a key "(" ---> No ---> push it to the stack
    3.if HashMap has a key ")" ----> Yes ---> get Top element(" ( ") ----> if topElement value for ")" key is not "(" ----> return false
    3.Correct
    
    
    
    Input: s = "([)]"
   1. {"(", "[", ")", "]"}
   2. if HashMap has a key "(" ---> No ---> push it to the stack
   3.if HashMap has a key "[" ----> No ---> push it to the stack
   4.if HashMap has a key ")" ----> Yes ---> get Top element(" [ ") -----> if Top element value for ")" key is not "(" ----> return false

   3.Incorrect
 */
