package map;
import java.util.HashMap;

public class hashcode {

	public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	map.put("sharath",35);
	map.put("ravi",28);
	map.put("dave",40);
	
	int age=map.get("sharath");
	System.out.println("the age of sharath"+age);
	
	boolean containssharath=map.keycontainskey("ravi");
	
    
	}

}
