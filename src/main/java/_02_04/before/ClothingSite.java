package _02_04.before;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {
        ShirtItem shirtItem = new ShirtItem();
        JacketItem jacketItem = new JacketItem();

        List<ClothingItem> itemsList = new ArrayList<>();        
        itemsList.add(shirtItem);
        itemsList.add(jacketItem);

        checkoutAllItems(itemsList);
    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List<ClothingItem> items) {
        items.forEach((i) -> checkoutItem(i));
    }

}
