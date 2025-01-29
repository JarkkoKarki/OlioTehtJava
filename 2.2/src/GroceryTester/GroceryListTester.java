package GroceryTester;

public class GroceryListTester {

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        System.out.println("Cost");
        groceryList.addItem("Apples", 2.50, "Fruits", 5);
        groceryList.addItem("Milk", 3.00, "Dairy", 2);
        groceryList.addItem("Bread", 1.50, "Bakery", 3);
        groceryList.addItem("Bananas", 1.20, "Fruits", 6);
        System.out.println("Total Cost: " + groceryList.calculateTotalCost());
        System.out.println();

        System.out.println("Categories");
        groceryList.addItem("Cheese", 4.00, "Dairy", 1);
        groceryList.displayByCategory("Fruits");
        groceryList.displayByCategory("Dairy");
        System.out.println();

        System.out.println("Quantity");
        groceryList.updateQuantity("Milk", 5);
        groceryList.updateQuantity("Cheese", 0);
        groceryList.displayAvailableItems();
        System.out.println("Total Cost after updates: " + groceryList.calculateTotalCost());
    }
}
