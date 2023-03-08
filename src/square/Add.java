package square;
import java.util.*;
import java.util.stream.Collectors;

public class Add {

	public static void main(String[] args) {
	List<Integer> squarenumbers=Arrays.asList(2,4,6,8,10);
	List<Integer> squarenum= squarenumbers.stream().map(t->t*t).collect(Collectors.toList());
	System.out.println(squarenum);
	}

}
