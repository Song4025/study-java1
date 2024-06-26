package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        orders[0] = order1;
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        orders[1] = order2;
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        orders[2] = order3;
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        int totalAmount = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명:"+order.productName+", 가격:"+order.price+", 수량:"+order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);
    }
}
