import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream filter and forEach() method example
 * 
 * @auth *
*
public class StreamFilterExample {
    public static void main(String[] args) {

        // using stream API
        List < Product > filteredProducts = getProducts().stream()
            .filter((product) -> product.getPrice() > 25000 f)
            .collect(Collectors.toList());
        filteredProducts.forEach(System.out::println);
    }

    private static List < Product > getProducts() {
        List < Product > productsList = new ArrayList < Product > ();
        productsList.add(new Product("HP Laptop",1,  25000 ));
        productsList.add(new Product("Dell Laptop",2,  30000 ))
        productsList.add(new Product( "Lenevo Laptop",3, 28000 ));
        productsList.add(new Product( "Sony Laptop",4, 28000 ));
        productsList.add(new Product( "Apple Laptop",5, 90000 ));
        return productsList;
    }
}




        