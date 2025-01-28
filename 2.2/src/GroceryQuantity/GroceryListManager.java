package GroceryQuantity;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {

    // Hinta ja määrä
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

    // Tuotteet ja tuotteen tiedot
    private HashMap<String, HashMap<String, ItemDetails>> groceryList = new HashMap<>();

    // hinta kategoria ja määrä
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.putIfAbsent(category, new HashMap<>());
        HashMap<String, ItemDetails> categoryItems = groceryList.get(category);

        // päivitetään määrää ja hintaa
        if (categoryItems.containsKey(item)) {
            ItemDetails details = categoryItems.get(item);
            details.quantity += quantity;
            details.cost = cost;
        } else {
            // jos tuotetta ei ole lisätään se
            categoryItems.put(item, new ItemDetails(cost, quantity));
        }
        System.out.println("Added \"" + item + "\" (Category: " + category + ", Cost: $" + cost + ", Quantity: " + quantity + ")");
    }

    // Päivitetään tuotetta
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
    public void calculateTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<String, HashMap<String, ItemDetails>> categoryEntry : groceryList.entrySet()) {
            for (Map.Entry<String, ItemDetails> itemEntry : categoryEntry.getValue().entrySet()) {
                ItemDetails details = itemEntry.getValue();
                totalCost += details.cost * details.quantity;
            }
        }
        System.out.println("Total cost: " + totalCost);
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItem("Apples", 2.50, "Fruits", 5);
        groceryList.addItem("Milk", 3.00, "Dairy", 2);
        groceryList.addItem("Bread", 1.50, "Bakery", 3);
        groceryList.addItem("Bananas", 1.20, "Fruits", 6);
        groceryList.addItem("Cheese", 4.00, "Dairy", 1);

        groceryList.calculateTotalCost();

        groceryList.displayList();

        groceryList.updateQuantity("Milk", 5);

        groceryList.displayAvailableItems();

        groceryList.updateQuantity("Cheese", 0);

        groceryList.displayAvailableItems();

        groceryList.calculateTotalCost();
    }
}
