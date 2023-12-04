package _java.Woche_04.Recap_01;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productList;

    public ProductRepo() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public Product searchProduct(String name) {
        for (Product product : productList) {
            if (product.name().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
