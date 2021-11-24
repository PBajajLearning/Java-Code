package com.learning.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        Map<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int diff = target - curr;
            Integer idx = store.get(diff);

            if (idx != null) {
                return new int[]{i, idx};

            } else {
                store.put(curr, i);
            }

        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,70};
        int target = 13;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }

}

