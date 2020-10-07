/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jakeovski
 */
public class TwoSum {

    public static void main(String args[]) {
        int[] input = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum2(input, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int first = nums[i];
            for (int e = 0; e < nums.length - 1; e++) {
                int last = nums[nums.length - 1 - e];
                if (first + last == target) {
                    if(i != nums.length-1 -e) {
                        result[0] = i;
                        result[1] = nums.length - 1 - e;
                        return result;
                    }
                }
            }
        }
        return result;
    }
    
    public static int[] twoSum2(int[] nums,int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
        
    }
}


/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
