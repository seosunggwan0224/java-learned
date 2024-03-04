package class1.practice;

public class productOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = "두부";
        productOrder.price = 2000;
        productOrder.quantity = 2;

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "김치";
        productOrder1.price = 5000;
        productOrder1.quantity = 1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "콜라";
        productOrder2.price = 1500;
        productOrder2.quantity = 2;

        ProductOrder[] productOrders = new ProductOrder[]{productOrder, productOrder1, productOrder2};

        long total = 0;
        for(int i = 0; i<productOrders.length; i++){
            ProductOrder p = productOrders[i];
            System.out.println("상품명 : " + p.productName + ", 가격 : " + p.price + ", 수량" + p.quantity);
            total += p.price * p.quantity;
        }
        System.out.println("총 결제 금액" + total);
    }
}
