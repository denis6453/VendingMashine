import PayApp.Product;
import PayApp.VendingMashine;
import PayApp.impl.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
 * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Main {
    static public void main (String[] args) {

        Product drink1 = new HotDrink("кофе", 55, LocalDate.now(), 50, 1);

        Product drink2 = new HotDrink("чай", 30, LocalDate.now(), 60, 2);


        VendingMashine hotDrinkVendingMashine = new HotDrinkVendingMashine();

        System.out.println("Выдано: " + hotDrinkVendingMashine.getProduct("чай", 2, 60));

        hotDrinkVendingMashine.addProducts(List.of(drink1,drink2));

        System.out.println(hotDrinkVendingMashine.printProducts());

        System.out.println("Выдано: " + hotDrinkVendingMashine.getProduct("чай", 2, 60));

        System.out.println(hotDrinkVendingMashine.printProducts());



    }
}