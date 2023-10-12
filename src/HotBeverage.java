public class HotBeverage extends Product {
    private int temperature;

    public HotBeverage(String name, int cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotBeverage{" +
                "name='" + getName() + '\'' +
                ", cost=" + getCost() +
                ", volume=" + getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}