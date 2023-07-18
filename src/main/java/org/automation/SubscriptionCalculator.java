package org.automation;

import java.util.ArrayList;
import java.util.List;

class Newspaper {
    String name;
    double[] prices;

    public Newspaper(String name, double[] prices) {
        this.name = name;
        this.prices = prices;
    }
}

public class SubscriptionCalculator {

    private static List<List<String>> findCombinations(double budget, List<Newspaper> newspapers) {
        List<List<String>> result = new ArrayList<>();
        findCombinationsHelper(budget, newspapers, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinationsHelper(double remainingBudget, List<Newspaper> newspapers, int idx,
                                               List<String> currentCombination, List<List<String>> result) {
        if (remainingBudget < 0) {
            return;
        }

        if (idx == newspapers.size()) {
            if (remainingBudget == 0) {
                result.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        Newspaper newspaper = newspapers.get(idx);

        for (int day = 0; day < newspaper.prices.length; day++) {
            double price = newspaper.prices[day];
            if (price <= remainingBudget) {
                currentCombination.add(newspaper.name);
                findCombinationsHelper(remainingBudget - price, newspapers, idx + 1, currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // Create the newspaper objects with their prices for each day
        List<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(new Newspaper("TOI", new double[]{3, 3, 3, 3, 3, 5, 6}));
        newspapers.add(new Newspaper("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4}));
        newspapers.add(new Newspaper("ET", new double[]{4, 4, 4, 4, 4, 4, 10}));
        newspapers.add(new Newspaper("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5}));
        newspapers.add(new Newspaper("HT", new double[]{2, 2, 2, 2, 2, 4, 0}));

        // Example input and output combinations
        double budget1 = 40;
        double budget2 = 35;

        List<List<String>> combinations1 = findCombinations(budget1, newspapers);
        List<List<String>> combinations2 = findCombinations(budget2, newspapers);

        System.out.println("Input: " + budget1);
        for (List<String> combination : combinations1) {
            System.out.println(combination);
        }

        System.out.println("\nInput: " + budget2);
        for (List<String> combination : combinations2) {
            System.out.println(combination);
        }
    }
}
