import java.util.ArrayList;

public class Shop {
  private ArrayList<Item> cart = new ArrayList<Item>();

  public void addItemToCart(Item item) {
    cart.add(item);
  }

  public void removeItemFromCart(int id) {
    cart.removeIf(item -> item.getId() == id);
  }

  public double checkout() {
    double totalCost = 0;
    System.out.println();
    System.out.println("You have following Items in cart:");
    System.out.println();

    for (Item item : cart) {
      System.out.println(item.getName() + " (ID: " + item.getFormattedId() + "; Cost: " + item.getCost() + ")");
      totalCost += item.getCost();
    }
    System.out.printf("Total cost: %.2f%n", totalCost);
    System.out.println();
    return totalCost;

  }
}
