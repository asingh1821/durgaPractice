package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


 class Product {
    Long id;
    String name;
    double price;

   public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FindMaximumPriceGreaterThanRangeOfProduct {
    public static void main(String[] args) {

        List<Product> list1 = new ArrayList<Product>();
        list1.add(new Product(1, "HP", 30000));
        list1.add(new Product(2, "ACER", 35000));
        list1.add(new Product(3, "DELL", 50000));
        list1.add(new Product(4, "MAC", 23000));
        list1.add(new Product(5, "LENOVO", 36000));

        list1.stream().filter(p-> p.price>25000)
                .forEach(n->System.out.println(n.name));
       // System.out.println(p1);

    }
}
