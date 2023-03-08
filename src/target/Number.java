package target;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Number {
	public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(10);
	list.add(15);
	list.add(25);
	list.add(30);
	list.add(35);
	list.add(15);
	list.add(20);
	for(int i=0;i<7;i++) {
		for(int j=1;j<7;j++) {
			   if (list.get(i)+list.get(j)==25) {
				   
				System.out.println(list.get(i)+"+"+list.get(j)+" "+"="+25);
				break;
				
			}
		}
	}

	}

}