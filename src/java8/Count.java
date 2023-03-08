package java8;
import java.util.*;
  
	class Product{  
	    int id;  
	    String name;  
	    float price;  
	    public Product(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price ;
	    }  
	}  
	public class JavaStream {  
	    public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"ab", ));  
	        productsList.add(new Product(2,",30000));  
	        productsList.add(new Product(3,"",28000f));  
	        productsList.add(new Product(4,"Sony ,));  
	        productsList.add(new Product(5,"Apple ));  
	        productsList.stream()  
	                    .filter(p ->p.price> 30000)   // filtering price  
	                    .map(pm ->pm.price)          // fetching price  
	                    .forEach(System.out::println);  // iterating price  
	    }  
	}  	


		
	}

}
