package link;
import java.util.*;
public class List {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> myListoffruits=new LinkedList<String>();
		for(int index=0;index<7;index++) {
			System.out.println("Enter the element("+(index+1)+"):");
		     myListoffruits.add(sc.next());
		}	
		System.out.println("size of linked list:"+myListoffruits.size());
		System.out.println("middle node :"+myListoffruits.get
		
	}

}
