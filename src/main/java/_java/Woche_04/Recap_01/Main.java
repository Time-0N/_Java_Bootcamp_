package _java.Woche_04.Recap_01;

import java.util.Scanner;

public class Main {

    private static void startOrder(ProductRepo productRepo, ShopService shopServiceUsingMapRepo) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name of the Product that you want to order");
        String orderName = sc.next();

        Product foundProduct = productRepo.searchProduct(orderName);

        if (foundProduct == null) {
            System.out.println("Product coudn't be found!");
        } else {
            String output = foundProduct.toString();
            System.out.println(output);

            Order order01 = new Order(0001, foundProduct.productNumber());

            shopServiceUsingMapRepo.addOrder(order01);
        }
    }


    public static void main(String[] args) {
        Product product01 = new Product("Meth", 1200, 01);
        ProductRepo productRepo = new ProductRepo();
        OrderListRepo orderListRepo = new OrderListRepo();
        ShopService shopServiceUsingListRepo = new ShopService(orderListRepo);
        productRepo.addProduct(product01);

        Scanner sc = new Scanner(System.in);

        startOrder(productRepo, shopServiceUsingListRepo);
    }
}

