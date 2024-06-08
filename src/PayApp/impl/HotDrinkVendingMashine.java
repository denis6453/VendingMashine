package PayApp.impl;

import PayApp.Product;
import PayApp.VendingMashine;

import java.util.List;

public class HotDrinkVendingMashine extends VendingMashine {

    public HotDrinkVendingMashine() {
    }

    public HotDrinkVendingMashine(List<Product> products) {
        super(products);
    }

}
