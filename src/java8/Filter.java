package java8;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
      public static void main(String[]args) {
    	List<String> names=Arrays.asList("ab","son","sam","son");
		List<String> repnames=names.stream().filter(p->Collections.frequency(names,p)>1).collect(Collectors.toList());
	    System.out.println(repnames);

}
}