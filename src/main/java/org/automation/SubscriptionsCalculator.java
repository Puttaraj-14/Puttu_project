package org.automation;

import java.util.ArrayList;
import java.util.List;

class project {
    String name;
    double[] prices;

    project(String name, double[] prices) {
        this.name = name;
        this.prices = prices;
    }
}

public class SubscriptionsCalculator {

    public static List<List<String>> findSubscriptions(project[] newspapers, double budget) {
        List<List<String>> result = new ArrayList<>();
        backtrack(newspapers, budget, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(project[] newspapers, double remainingBudget, int startIndex, List<String> currentCombination, List<List<String>> result) {
        if (remainingBudget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = startIndex; i < newspapers.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (remainingBudget >= newspapers[i].prices[j]) {
                    currentCombination.add(newspapers[i].name);
                    backtrack(newspapers, remainingBudget - newspapers[i].prices[j], i + 1, currentCombination, result);
                    currentCombination.remove(currentCombination.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        project[] newspapers = {
                new project("TOI", new double[]{3, 3, 3, 3, 3, 5, 6}),
                new project("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4}),
                new project("ET", new double[]{4, 4, 4, 4, 4, 4, 10}),
                new project("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5}),
                new project("HT", new double[]{2, 2, 2, 2, 2, 4, 4})
        };

        double budget = 40;
        List<List<String>> validCombinations = findSubscriptions(newspapers, budget);

        System.out.println("Possible combinations of subscriptions within the budget:");
        for (List<String> combination : validCombinations) {
            System.out.println(combination);
        }
    }
}
