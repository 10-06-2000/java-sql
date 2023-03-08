package java8;
import java.util.*;
import java.util.stream.Collectors;

public class City {

	public static void main(String[] args) {
		List<String> c=Arrays.asList("Trivandrum","Thrissur","kulathoor","kazhakottam");
		List<String> cityname=c.stream().filter(t->t.toLowerCase().startsWith("t")).collect(Collectors.toList());
		System.out.println(cityname);		
				
		
				
		

	}

}
