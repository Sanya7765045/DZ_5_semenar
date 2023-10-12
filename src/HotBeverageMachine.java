import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotBeverageMachine extends VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProducts(Product... products) {
        productList.addAll(Arrays.asList(products));
    }

    @Override
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