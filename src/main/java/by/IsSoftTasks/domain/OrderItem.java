package by.IsSoftTasks.domain;

public class OrderItem {

    private String name;
    private int countOfItems;
    private int cost;

    public OrderItem(String name, int countOfItems, int cost) {
        this.name = name;
        this.countOfItems = countOfItems;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfItems() {
        return countOfItems;
    }

    public void setCountOfItems(int countOfItems) {
        this.countOfItems = countOfItems;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

