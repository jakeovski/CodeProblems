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
public class MaximumSubArray {

    public static void main(String[] args) {

        int[] nums = {-1, -1, -2,-2};

        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

                int neg = 0;
        int highest;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] < 0) {
                neg++;
            }
        }
        if(neg == nums.length) {
            highest = nums[0];
            for (int g : nums) {
                if(highest < g) {
                    highest = g;
                }
            }
            return highest;
        }else {
            
            int size = nums.length;
            int start = 0;
            int end = 0;

            int maxSoFar = 0;
            int maxEndingHere = 0;

            if (size == 1 && nums[0] < 0) {
                return nums[0];
            } else {
                for (int i = 0; i < size; i++) {
                    if (nums[i] > maxEndingHere + nums[i]) {
                        start = i;
                        maxEndingHere = nums[i];
                    } else {
                        maxEndingHere = maxEndingHere + nums[i];
                    }
                    if (maxSoFar < maxEndingHere) {
                        maxSoFar = maxEndingHere;
                        end = i;
                    }
                }
            }
            return maxSoFar;
        }
    }
}
