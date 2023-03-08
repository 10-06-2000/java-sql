package customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Test1 {

	public static void main(String[] args) {
	List<Hotel>	HotelDetails = new ArrayList<Hotel>();
	
	HotelDetails.add(new Hotel ("Redchilly",2000,"kkm"));
	HotelDetails.add(new Hotel ("Amigos",1000,"klm"));
	HotelDetails.add(new Hotel ("Ruchi",3000,"Kkd"));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the budegt");
	int limit=sc.nextInt();
	List<Hotel> h=HotelDetails.stream().filter(val->val.getBudget()
    
	
			
	

	}

}
