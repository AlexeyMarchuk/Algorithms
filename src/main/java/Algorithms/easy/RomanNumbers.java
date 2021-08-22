package Algorithms.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RomanNumbers {
//VI - 6
//
//    Input: s = "LVIII"
//    Output: 58

    //    Input: s = "LIX"
//    Output: 59
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] arrayOfChars = s.toCharArray();
        List<Integer> arraysOfInt = new ArrayList<>();
              for(char d : arrayOfChars){
                  arraysOfInt.add(map.get(d));
              }

        System.out.println("array: " + arraysOfInt);

        int temporalResult = arraysOfInt.get(arraysOfInt.size()-1);

        for(int i = arraysOfInt.size()-1; i > 0; i --){

            Integer last = arraysOfInt.get(i);
            Integer preLast = arraysOfInt.get(i-1);
            System.out.println("preLast: " + preLast + " last: " + last);

            if(last > preLast) {
                temporalResult -= preLast;
            } else {
                temporalResult += preLast;

            }
            System.out.println("result: " + temporalResult);
        }
        System.out.println(temporalResult);
        return temporalResult;
    }


}
