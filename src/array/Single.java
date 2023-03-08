package array;

public class Single { 
	public static void main(String[] args) {
   
    int[] array= {5,3,8,1,7,2};
    int Max=array[0];
    for(int i=0;i<array.length;i++) {
    	if(array[i]>Max) 
    		Max=array[i];
    	}
    	System.out.println("max num is " +Max);
    	
 }
}


