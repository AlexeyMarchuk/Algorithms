package Algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    //    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//    You must implement a solution with a linear runtime complexity and use only constant extra space.
    public static void execute(int[] nums) {

        int temp =0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
            System.out.println(temp);
        }

        int a = 1;
        int b= 2;

        int c = 20^19;

        System.out.println("-----");
        System.out.println(c);
        System.out.println("-----");
        System.out.println("tt" +c);
        System.out.println(c ^ 8);

//        System.out.println(temp);
    }

}


