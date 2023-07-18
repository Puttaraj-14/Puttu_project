package org.automation;

import java.util.*;
import java.util.function.*;

class Filter {
    public static Predicate<String> nameStartingWithPrefix(String prefix) {
        return s -> s.startsWith(prefix);
    }
}

class Mapper {
    public static Function<String, CharactersCount> getDistinctCharactersCount() {
        return s -> {
            Set<Character> charSet = new HashSet<>();
            for (char c : s.toCharArray()) {
                charSet.add(c);
            }
            return new CharactersCount(s, charSet.size());
        };
    }
}

class CharactersCount {
    String name;
    int distinctCharacterCount;

    public CharactersCount(String name, int distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    public String toString() {
        return "\"" + name + "\" has " + distinctCharacterCount + " distinct characters.";
    }
}

public class Solution {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        String prefix = "aa";

        names.stream()
                .filter(Filter.nameStartingWithPrefix(prefix))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}
