package PayApp;

import PayApp.impl.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    protected List<Product> products;

    public VendingMashine() {
        this.products = new ArrayList<>();
    }

    public VendingMashine(List<Product> products) {
        this.products = products;
    }

    public List<Product> printProducts() {
        return products;
    }

    public void addProducts (List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;

            }
        }
        throw new RuntimeException("No such Product" + name);
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    products.remove(hotDrink);
                    return hotDrink;
                }
            }
        }
        return null; // В случае если продукт не найден
    }


    @Override
    public String toString() {
        return "VendingMashine{" +
                "products=" + products +
                '}';
    }
}
