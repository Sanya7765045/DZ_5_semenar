import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    private List<Product> productList = new ArrayList<>();

    public void initProducts(Product... products) {
        productList.addAll(Arrays.asList(products));
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && product.getVolume() == volume &&
                    product instanceof HotBeverage && ((HotBeverage) product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}