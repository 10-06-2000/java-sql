package ustbatchno3.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class EmployeeTest {
	
	
@Test
  public void testemployee() {
	
	Employee e= new Employee("sharath", 30, "java");
	Assert.assertEquals(e.getDepartment(),"java");
	
	
}
	
}
   
