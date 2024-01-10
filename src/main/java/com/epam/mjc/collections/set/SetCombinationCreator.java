package com.epam.mjc.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> answer = new LinkedHashSet<>();
        for (var string : firstSet) {
            if (secondSet.contains(string) && !thirdSet.contains(string)) {
                answer.add(string);
            } else thirdSet.remove(string);
        }
        for (var string : secondSet) {
            thirdSet.remove(string);
        }
        answer.addAll(thirdSet);
        return answer;
    }
}
