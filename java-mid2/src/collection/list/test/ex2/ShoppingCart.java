package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {


    List<Item> shoppingList = new ArrayList<>();

    public  void addItem(Item item) {
        shoppingList.add(item);

    }

    public void displayItems() {

        int total = 0;

        System.out.println("장바구니 상품출력");
        for (int i = 0; i < shoppingList.size(); i++) {
            total += shoppingList.get(i).getTotalPrice();
            System.out.println("상품명:" + shoppingList.get(i).getName() + " 합계:" + shoppingList.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합: " + total);
    }
}
