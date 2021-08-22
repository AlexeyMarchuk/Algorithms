package Algorithms.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAllNumbersDisapearedInArray {
// 1,2,3,3,6,5
    public static void execute(Integer[] nums) {


        HashSet<Integer> exclusiveValues = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            exclusiveValues.add(nums[i]);
        }

        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(!exclusiveValues.contains(i+1)){
                resultList.add(i+1);
            }
        }

        System.out.println("Input array:" + exclusiveValues);
        System.out.println("Disappear elements are:" + resultList);


    }
}
