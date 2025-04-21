package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2);
        cart.addItem(item2); //itemCount == 9 -> ItemCount == 10
        cart.addItem(item2); //여기서 에러

        cart.displayItems();
    }
}