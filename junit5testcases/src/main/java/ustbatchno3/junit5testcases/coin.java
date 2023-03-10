package ustbatchno3.junit5testcases;

import java.time.LocalDate;


public class coin {


	public String  findcoins(LocalDate date) {
		int day= date.getDayOfYear();
		if(day<80 || day>365) {
			return "5";
		}
		else if(day<172) {
			return "3";
		}
		else if(day<266) {
			return "1";
		}
		else {
		 return  null;
		}
	}
}



