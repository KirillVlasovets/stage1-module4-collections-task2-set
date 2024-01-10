package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> answer = new HashSet<>();
        for (var number : sourceList) {
            if (number % 2 == 0) {
                answer.add(number);
                while (number % 2 == 0) {
                    number /= 2;
                    answer.add(number);
                }
            } else {
                answer.add(number);
                answer.add(number * 2);
            }
        }
        return answer;
    }
}
