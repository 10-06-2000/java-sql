package ustbatchno3.junit5testcases;



 import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Collections;


 public class Countword {
		public static void main (String[]ags) {
			List<String> list = new ArrayList<String>();
			list.add("aaa");
			list.add("bbb");
			list.add("aaa");

			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
			    System.out.println(key + ": " + Collections.frequency(list, key));
			}
		
		}}
	
