package Day13;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Learning_Lambda_ShortCuts_Conditions {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Phone",1200));
        productList.add(new Product(2,"Tablet",3000));
        productList.add(new Product(3,"TV",4000));
        productList.add(new Product(4,"Laptop",6000));

        productList.stream().filter(product -> product.price > 3000).forEach(product -> System.out.println(product.name));


    }
}
