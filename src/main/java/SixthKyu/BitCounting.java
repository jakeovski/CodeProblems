/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SixthKyu;

/**
 *
 * @author Jakeovski
 */
public class BitCounting {

    public static void main(String args[]) {
        System.out.println(countBits(1234));
    }

    /*
    public void testGame() {
    assertEquals(5, BitCounting.countBits(1234)); 
    assertEquals(1, BitCounting.countBits(4)); 
    assertEquals(3, BitCounting.countBits(7)); 
    assertEquals(2, BitCounting.countBits(9)); 
    assertEquals(2, BitCounting.countBits(10)); 
  }
     */
    public static int countBits(int n) {
        // Show me the code!      
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0;i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    
    
}
