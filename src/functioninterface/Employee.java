package functioninterface;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		
		 class Test {
			 
				private String pdname;
				private int id;
				private int Salary;
				public Test(String pdname, int id, int Salary) {
					super();
					this.pdname = pdname;
					this.id = id;
					this.Salary = Salary;
				}
				public String getPdname() {
					return pdname;
				}
				public void setPdname(String pdname) {
					this.pdname = pdname;
				}
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public int getSalary() {
					return Salary;
				}
				@Override
				public String toString() {
					return "Test [pdname=" + pdname + ", id=" + id + ", Salary=" + Salary + "]";
				}
			
		
				}
				
				
			}


	}


