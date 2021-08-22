package Algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int [] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i ++) {
            hashMap.put(target-nums[i], i);
        }

        for(int i = 0; i< nums.length; i++){
            Integer val = hashMap.get(nums[i]);
            if(val != null && val != i) {
                result[0] = i;
                result[1] = hashMap.get(nums[i]);
                System.out.println(result[0] + " " + result[1]);
                return result;
            }
        }
        return result;
    }
}
