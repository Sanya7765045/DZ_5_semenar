public class Product {
    private String name;
    private int cost;
    private int volume;

    public Product(String name, int cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", volume=" + volume +
                '}';
    }
}