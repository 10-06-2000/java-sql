package arraylist;
import java.util.*;
public class Name {
public static void main(String[] args) {
ArrayList<String>list=new ArrayList<String>();
   list.add("Mango");
   list.add("Apple");
   list.add("Orange");
   list.add("Strawberry");
   Iterator itr=list.iterator();
   while(itr.hasNext())
    System.out.println(itr.next());

	

	}

}
