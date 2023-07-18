package org.automation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewspaperSubscriptionCalculator {

    // Newspaper subscription details
    private static Map<String, double[]> newspapers = new HashMap<>();

    static {
        newspapers.put("TOI", new double[]{3, 3, 3, 3, 3, 5, 6});
        newspapers.put("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4});
        newspapers.put("ET", new double[]{4, 4, 4, 4, 4, 4, 10});
        newspapers.put("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5});
        newspapers.put("HT", new double[]{2, 2, 2, 2, 2, 4, 4});
    }

    public static List<List<String>> findCombinations(double budget) {
        List<List<String>> result = new ArrayList<>();
        findCombinationsHelper(budget, new ArrayList<>(), 0, result);
        return result;
    }

    private static void findCombinationsHelper(
            double remainingBudget,
            List<String> currentCombination,
            int index,
            List<List<String>> result
    ) {
        if (remainingBudget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        if (index >= newspapers.size()) {
            return;
        }

        String[] newspaperNames = newspapers.keySet().toArray(new String[0]);
        String currentNewspaper = newspaperNames[index];
        double[] prices = newspapers.get(currentNewspaper);

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= remainingBudget) {
                currentCombination.add(currentNewspaper);
                findCombinationsHelper(
                        remainingBudget - prices[i],
                        currentCombination,
                        index + 1,
                        result
                );
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the weekly budget in Indian rupees: ");
        double userBudget = scanner.nextDouble();
        scanner.close();

        List<List<String>> combinations = findCombinations(userBudget);

        if (combinations.isEmpty()) {
            System.out.println("No combinations found for the given budget.");
        } else {
            System.out.println("Possible combinations:");
            for (List<String> combination : combinations) {
                System.out.println(combination);
            }
        }
    }
}
