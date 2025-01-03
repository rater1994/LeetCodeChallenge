package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
s
You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */


    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};

//        twoSum(numbers, 9);
        twoSum(numbers, 9);
    }


    // This solution is O(n^2) complexity
    public static int[] twoSum(int[] nums, int target) {
        int newNumber = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            newNumber = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (newNumber == nums[j]) {
                    result = new int[]{i, j};
                    System.out.println(i + " " + j);
                }
            }
        }
        return result;
    }


    // This solution is One-pass hash table (we have only O(n) complexity because we use only a single for
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}