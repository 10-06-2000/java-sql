package customer;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maintest {

	public static void main(String[] args) {
	List<Test> CustomersDetails= new ArrayList <Test>();
	CustomersDetails.add(new Test( 1,"Sam",55000,"sam@gmail.com","thsr"));
	CustomersDetails.add(new Test( 2,"son",60000," son@gamil.com","tvm"));
	CustomersDetails.add(new Test(  3,"ath", 70000, " ath@gmail.com","kkm"));
	CustomersDetails.add(new Test(  1,"sam",80090, "sam@gmail.com","kizh"));
	CustomersDetails.add(new Test( 2,"son",9000, " son@gmail.com","ghj"));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int RegId=sc.nextInt();
	
	List<Test> c= CustomersDetails.stream()
	.filter(e->e.getRegId()==RegId)
	.collect(Collectors.toList());
	if(c.isEmpty()) {
	System.out.println("Records not found");}
	else {
		System.out.println(c);}
	}
}
	
	

	


