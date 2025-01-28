package GroceryCost;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList2 = new HashMap<>();

    // Add methods here

    public void addItem(String item, double cost) {
        groceryList2.put(item, cost);
        System.out.println(item + " added to grocery list with cost: " + cost);
    }
    public void removeItem(String item) {
        if (groceryList2.containsKey(item)) {
            System.out.println(item + " removed from grocery list " + groceryList2.get(item));
            groceryList2.remove(item);
        } else {
            System.out.println(item + " not found in grocery list " + groceryList2.get(item));
        }
    }
    public void displayList() {
        int i = 1;
        System.out.println("Grocery List:");
        for (Map.Entry<String, Double> entry : groceryList2.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + " - " + entry.getValue());
            i++;
        }
        System.out.println();
    }
    public void checkItem(String item) {
        System.out.println("Is \"" + item + "\" in the grocery list? " + groceryList2.containsKey(item) +"\n");

    }

    public void calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList2.values()) {
            totalCost += cost;
        }
        System.out.println("Total cost: " + totalCost);
    }

    public static void main(String[] args) {
        GroceryListManager groceryList2= new GroceryListManager();
        groceryList2.addItem("Apples", 2.50);
        groceryList2.addItem("Milk", 3.00);
        groceryList2.addItem("Bread", 1.50);
        groceryList2.displayList();
        groceryList2.calculateTotalCost();
        groceryList2.checkItem("Apples");
        groceryList2.checkItem("Milk");
        groceryList2.removeItem("Milk");
        groceryList2.displayList();
        groceryList2.calculateTotalCost();

    }
}