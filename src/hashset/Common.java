package hashset;
import java.util.*;

public class Common {

	public static void main(String[] args) {
	
		 
		class Common {
		    private static void FindCommonElemet(String[] arr1,
		                                         String[] arr2)
		    {
		        Set<String> set = new HashSet<>();
		        for (int i = 0; i < arr1.length; i++) {
		            for (int j = 0; j < arr2.length; j++) {
		                if (arr1[i] == arr2[j]) {
		 
		                   
		                    set.add(arr1[i]);
		                    break;
		                }
		            }
		        } for (String i : set) {
		            System.out.print(i + " ");
		        }
		    }
		}
	

	}

}
