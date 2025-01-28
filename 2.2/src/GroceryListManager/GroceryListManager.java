package GroceryListManager;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Add methods here

    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        } else {
            System.out.println("Item is already in the grocery list");
        }
    }
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Removing \"" + item + "\" from the list... \n");
            groceryList.remove(item);
        } else {
            System.out.println("Item \"" + item + "\" is not in the list... \n");
        }
    }
    public void displayList() {
        int i = 1;
        System.out.println("Grocery List:");
        for (String item : groceryList) {
            System.out.println(i + ". " + item);
            i++;
        }
        System.out.println();
    }
    public void checkItem(String item) {
        System.out.println("Is \"" + item + "\" in the grocery list? " + groceryList.contains(item) +"\n");
    }
    public static void main(String[] args) {
        GroceryListManager groceryList= new GroceryListManager();
        groceryList.addItem("Apples");
        groceryList.addItem("Milk");
        groceryList.addItem("Bread");
        groceryList.displayList();
        groceryList.checkItem("Milk");
        groceryList.removeItem("Milk");
        groceryList.displayList();

    }
}