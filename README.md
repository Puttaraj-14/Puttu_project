# Puttu_project


Class newspaperSubscription:

This class represents a newspaper subscription and has two instance variables: name (the name of the newspaper) and dailyPrices (an array of daily subscription prices for the newspaper).
The constructor newspaperSubscription is used to create instances of this class, taking the name and dailyPrices as parameters.
getName() method returns the name of the newspaper.
getWeeklyCost() method calculates and returns the total cost of subscribing to the newspaper for a week by summing up the daily subscription prices.
Class newspaperCombinations:

This class contains the main method and is the entry point of the program.
initializeNewspapers() method initializes a list of newspaperSubscription objects and adds them to the newspaperSubscriptions list.
calculateCombinations(double budget) method calculates all valid combinations of newspapers that can be subscribed to within the given budget.
combinations(int n, int k) method generates all possible combinations of size k from a set of n newspapers. It uses a recursive approach to find the combinations.
printCombinations(List<List<String>> combinations) method prints the valid combinations of newspapers.
In the main method:

The weeklyBudget is set to 35 or 45
The initializeNewspapers() method is called to create instances of newspaperSubscription objects for different newspapers and add them to the newspaperSubscriptions list.
The calculateCombinations(weeklyBudget) method is called to find all valid combinations of newspapers within the given budget.
The valid combinations are then printed using the printCombinations(validCombinations) method.
