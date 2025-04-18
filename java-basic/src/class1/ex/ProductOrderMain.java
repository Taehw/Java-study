package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder dubu = new ProductOrder();

        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();

        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();

        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] orders = {dubu, kimchi, coke}; //안에 숫자 넣어서 맨 위에 선언하는게 깔끔한가?
        int totalPrice = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalPrice += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }
}
