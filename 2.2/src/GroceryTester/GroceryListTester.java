package GroceryTester;

public class GroceryListTester {

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        System.out.println("Hinta");
        groceryList.addItem("Apples", 2.50, "Fruits", 5);
        groceryList.addItem("Milk", 3.00, "Dairy", 2);
        groceryList.addItem("Bread", 1.50, "Bakery", 3);
        groceryList.addItem("Bananas", 1.20, "Fruits", 6);
        System.out.println("Total Cost: " + groceryList.calculateTotalCost());
        System.out.println();

        // Testing Categories of Items
        System.out.println("Kategoria");
        groceryList.addItem("Cheese", 4.00, "Dairy", 1);
        groceryList.displayByCategory("Fruits");
        groceryList.displayByCategory("Dairy");
        System.out.println();

        // Testing Quantity Tracking
        System.out.println("Määrä");
        groceryList.updateQuantity("Milk", 5); // Update quantity of Milk
        groceryList.updateQuantity("Cheese", 0); // Set Cheese quantity to 0
        groceryList.displayAvailableItems(); // Display items with positive quantities
        System.out.println("Total Cost after updates: " + groceryList.calculateTotalCost());
    }
}
