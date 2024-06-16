import java.util.ArrayList;

public class ItemService {
  private ArrayList<Item> items = new ArrayList<Item>();

  public ArrayList<Item> getItems() {
    return items;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(int id) {
    items.removeIf(item -> item.getId() == id);
  }

  public void updateItem(int id, String name, double cost) {
    for (var item : items) {
      if (item.getId() == id) {
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }
}
