package Algorithms;

import java.util.*;

public class Yandex {
    public static void sumOfThreeValuesEqualsK(Integer[] arr, int k) {
        List<Integer> inputList = Arrays.asList(arr);
        Map<Integer, ArrayList<Set<Integer>>> aggregator = new HashMap<>();

        int maxValue = inputList.stream().max(Comparator.naturalOrder()).get();

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {

                int elementIPlusElementJ = inputList.get(i) + inputList.get(j);
                Integer kMinusElements = k - elementIPlusElementJ;

                Set<Integer> innerSet = new HashSet<>();

                    if(kMinusElements < maxValue) {
                        if (aggregator.containsKey(kMinusElements)) {
                            innerSet.add(i);
                            innerSet.add(j);
                            aggregator.get(kMinusElements).add(innerSet);
                        } else {
                            ArrayList<Set<Integer>> outerlist = new ArrayList<>();
                            innerSet.add(i);
                            innerSet.add(j);
                            outerlist.add(innerSet);
                            aggregator.put(kMinusElements, outerlist);
                        }
                    }
            }
        }

        Set<Object> resultSet = new HashSet<>();
        for (int i = 0; i < inputList.size(); i++) {
            ArrayList<Set<Integer>> outerList = aggregator.get(inputList.get(i));
            int finalI = i;

            if (outerList != null) {
                outerList.forEach(innerSet -> {
                    if(!innerSet.contains(finalI)) {
                       Set<Integer> result =  new HashSet<>(innerSet);
                        result.add(finalI);
                        resultSet.add(result);
                    }
                });
            }
        }
        resultSet.forEach(System.out::println);
        System.out.println("count of pairs with three elements is: " + resultSet.size());
    }

}
