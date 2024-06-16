public class Item {
    private int id;
    private String name;
    private double cost;
    private String formattedId;

    public Item(int id) {
        this.id = id;
        this.formattedId = String.format("%03d", id); 
    }

    public Item(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.formattedId = String.format("%03d", id); 
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getFormattedId() {
        return formattedId;
    }
}
