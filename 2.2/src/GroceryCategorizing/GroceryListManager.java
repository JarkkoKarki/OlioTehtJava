package GroceryCategorizing;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, HashMap<String, Double>> groceryList = new HashMap<>();

    // Add methods here

    public void addItem(String item, double cost, String category) {
        groceryList.putIfAbsent(category, new HashMap<>());
        groceryList.get(category).put(item, cost);
        System.out.println(item + " added to grocery list with cost: " + cost + ", category: " + category);
    }
    public void removeItem(String item, String category) {
        if (groceryList.containsKey(category) && groceryList.get(category).containsKey(item)) {
            System.out.println(item + " removed from grocery list " + category);
            groceryList.get(category).remove(item);
            if (groceryList.get(category).isEmpty()) {
                groceryList.remove(category);
        }
        } else {
        System.out.println(item + " not found in grocery list " + category);}
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, HashMap<String, Double>> categoryEntry : groceryList.entrySet()) {
            String category = categoryEntry.getKey();
            System.out.println("Category: " + category);
            int i = 1;
            for (Map.Entry<String, Double> itemEntry : categoryEntry.getValue().entrySet()) {
                System.out.println("  " + i + ". " + itemEntry.getKey() + " - $" + itemEntry.getValue());
                i++;
            }
        }
        System.out.println();
    }
    public void displayByCategory(String category) {
        if (groceryList.containsKey(category)) {
            System.out.println("Items in category \"" + category + "\":");
            int i = 1;
            for (Map.Entry<String, Double> itemEntry : groceryList.get(category).entrySet()) {
                System.out.println("  " + i + ". " + itemEntry.getKey() + " - $" + itemEntry.getValue());
                i++;
            }
        } else {
            System.out.println("Category \"" + category + "\" does not exist in the grocery list.");
        }
        System.out.println();
    }

    public void calculateTotalCost() {
        double totalCost = 0;
        for (HashMap<String, Double> items : groceryList.values()) {
            for (double cost : items.values()) {
                totalCost += cost;
            }
        }
        System.out.println("Total cost: " + totalCost);
    }
    public static void main(String[] args) {
        GroceryListManager groceryList3= new GroceryListManager();
        groceryList3.addItem("Apples", 2.50, "Fruits");
        groceryList3.addItem("Milk", 3.00, "Dairy");
        groceryList3.addItem("Bread", 1.50, "Bakery");
        groceryList3.displayList();
        groceryList3.displayByCategory("Dairy");
        groceryList3.calculateTotalCost();
        groceryList3.removeItem("Milk", "Dairy");
        groceryList3.displayList();
        groceryList3.calculateTotalCost();

    }
}