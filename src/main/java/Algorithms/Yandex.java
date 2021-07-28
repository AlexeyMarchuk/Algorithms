package Algorithms;

import java.util.*;

public class Yandex {
    public static void sumOfThreeValuesEqualsK(Integer[] arr, int k) {
        List<Integer> inputList = Arrays.asList(arr);
        Map<Integer, ArrayList<Set<Integer>>> aggregator = new HashMap<>();

        int maxValue = inputList.stream().max(Comparator.naturalOrder()).get();

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {

                Integer elementI = inputList.get(i);
                Integer elementJ = inputList.get(j);
                int elementIPlusElementJ = elementI + elementJ;
                Integer kMinusElements = k - elementIPlusElementJ;

                Set<Integer> innerlist = new HashSet<>();

                    if(kMinusElements < maxValue) {
                        if (aggregator.containsKey(kMinusElements)) {
                            innerlist.add(i);
                            innerlist.add(j);
                            aggregator.get(kMinusElements).add(innerlist);
                        } else {
                            ArrayList<Set<Integer>> outerlist = new ArrayList<>();
                            innerlist.add(i);
                            innerlist.add(j);
                            outerlist.add(innerlist);
                            aggregator.put(kMinusElements, outerlist);
                        }
                    }
            }
        }

        Set<Object> resultSet = new HashSet<>();
        for (int i = 0; i < inputList.size(); i++) {
            ArrayList<Set<Integer>> valuedrap = aggregator.get(inputList.get(i));
            int finalI = i;

            if (valuedrap != null) {
                valuedrap.forEach(innerList -> {
                    if(!innerList.contains(finalI)) {
                       Set<Integer> result =  new HashSet<>(innerList);
                        result.add(finalI);
                        resultSet.add(result);
                    }
                });
            }
        }
        resultSet.forEach(System.out::println);
        System.out.println(resultSet.size());
    }

}
