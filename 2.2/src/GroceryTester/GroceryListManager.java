package GroceryTester;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {

    private static class ItemDetails {
        double cost;
        int quantity;

        public ItemDetails(double cost, int quantity) {
            this.cost = cost;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Cost: $" + cost + ", Quantity: " + quantity;
        }
    }

    private HashMap<String, HashMap<String, ItemDetails>> groceryList = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.putIfAbsent(category, new HashMap<>());
        HashMap<String, ItemDetails> categoryItems = groceryList.get(category);

        if (categoryItems.containsKey(item)) {
            ItemDetails details = categoryItems.get(item);
            details.quantity += quantity;
            details.cost = cost;
        } else {
            categoryItems.put(item, new ItemDetails(cost, quantity));
        }
        System.out.println("Added \"" + item + "\" (Category: " + category + ", Cost: $" + cost + ", Quantity: " + quantity + ")");
    }

    public void updateQuantity(String item, int newQuantity) {
        for (Map.Entry<String, HashMap<String, ItemDetails>> categoryEntry : groceryList.entrySet()) {
            HashMap<String, ItemDetails> categoryItems = categoryEntry.getValue();
            if (categoryItems.containsKey(item)) {
                categoryItems.get(item).quantity = newQuantity;
                System.out.println("Updated quantity of \"" + item + "\" to " + newQuantity);
                return;
            }
        }
        System.out.println("Item \"" + item + "\" not found.");
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (Map.Entry<String, HashMap<String, ItemDetails>> categoryEntry : groceryList.entrySet()) {
            String category = categoryEntry.getKey();
            System.out.println("Category: " + category);
            int i = 1;
            for (Map.Entry<String, ItemDetails> itemEntry : categoryEntry.getValue().entrySet()) {
                ItemDetails details = itemEntry.getValue();
                if (details.quantity > 0) {
                    System.out.println("  " + i + ". " + itemEntry.getKey() + " - " + details);
                    i++;
                }
            }
        }
        System.out.println();
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, HashMap<String, ItemDetails>> categoryEntry : groceryList.entrySet()) {
            String category = categoryEntry.getKey();
            System.out.println("Category: " + category);
            int i = 1;
            for (Map.Entry<String, ItemDetails> itemEntry : categoryEntry.getValue().entrySet()) {
                System.out.println("  " + i + ". " + itemEntry.getKey() + " - " + itemEntry.getValue());
                i++;
            }
        }
        System.out.println();
    }

    public void displayByCategory(String category) {
        if (!groceryList.containsKey(category)) {
            System.out.println("Category \"" + category + "\" not found.");
            return;
        }

        System.out.println("Items in Category: " + category);
        int i = 1;
        for (Map.Entry<String, ItemDetails> itemEntry : groceryList.get(category).entrySet()) {
            System.out.println("  " + i + ". " + itemEntry.getKey() + " - " + itemEntry.getValue());
            i++;
        }
        System.out.println();
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<String, HashMap<String, ItemDetails>> categoryEntry : groceryList.entrySet()) {
            for (Map.Entry<String, ItemDetails> itemEntry : categoryEntry.getValue().entrySet()) {
                ItemDetails details = itemEntry.getValue();
                totalCost += details.cost * details.quantity;
            }
        }
        return totalCost;
    }
}
