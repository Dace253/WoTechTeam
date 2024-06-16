//13.06 version 2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        ItemService itemService = new ItemService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Addmin panel options:");
            System.out.println("    1. Add item to shop");
            System.out.println("    2. Remove item from shop");
            System.out.println("    3. Update item in shop");
            System.out.println("Customer panel options: ");
            System.out.println("    4. Add item to cart");
            System.out.println("    5. Remove item from cart");
            System.out.println("    6. Checkout");
            System.out.println("7. Exit");
            System.out.println();
            System.out.print("Please enter your action: ");

            int action = scanner.nextInt();
            scanner.nextLine(); 

            switch (action) {
                case 1:
                    System.out.print("Enter item ID: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item cost: ");
                    double cost = scanner.nextDouble();
                    scanner.nextLine(); 
                    Item newItem = new Item(addId, name, cost);
                    itemService.addItem(newItem);
                    System.out.println();
                    System.out.println("Item added to shop.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter item ID to remove: ");
                    int removeId = scanner.nextInt();
                    itemService.removeItem(removeId);
                    System.out.println();
                    System.out.println("Item removed from shop.");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter item ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new item name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new item cost: ");
                    double newCost = scanner.nextDouble();
                    scanner.nextLine(); 
                    itemService.updateItem(updateId, newName, newCost);
                    System.out.println();
                    System.out.println("Item updated in shop.");
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter item ID to add to cart: ");
                    int cartAddId = scanner.nextInt();
                    scanner.nextLine(); 
                    Item itemToAdd = findItemById(itemService, cartAddId);
                    if (itemToAdd != null) {
                        shop.addItemToCart(itemToAdd);
                        System.out.println();
                        System.out.println("Item added to cart.");
                        System.out.println();
                    } else {
                        System.out.println("Item not found in shop.");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.print("Enter item ID to remove from cart: ");
                    int cartRemoveId = scanner.nextInt();
                    scanner.nextLine(); 
                    shop.removeItemFromCart(cartRemoveId);
                    System.out.println("Item removed from cart.");
                    System.out.println();
                    break;
                case 6:
                    shop.checkout(); 
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Item findItemById(ItemService itemService, int id) {
        for (Item item : itemService.getItems()) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
        











