package positive;

public class count{

	public static void main(String[] args) {
	  int[] arr= {4,-4,6,8,-9,0,4,-7,56};
	  int positivecount=0; 
	  int negativecount=0;
	  for(int i=0;i<9;i++) {
		if(arr[i]>=0) {
		
		   positivecount=positivecount+1;
	     }
	    else {
		   negativecount=negativecount+1;
		}

	}

       System.out.println("positive count is" +positivecount);
       System.out.println("negative count is"+negativecount);

	}}
	
