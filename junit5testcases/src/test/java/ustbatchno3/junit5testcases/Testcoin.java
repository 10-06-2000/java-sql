package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;






public class Testcoin{
	
	@Test
	public void testDate5() {
		
		coin g= new coin();
		assertEquals("5",g.findcoins(LocalDate.of(2022, 2,2)));
		assertEquals("3",g.findcoins(LocalDate.of(2022, 4,2)));
		assertEquals("1",g.findcoins(LocalDate.of(2022, 8,2)));
		assertEquals(null,g.findcoins(LocalDate.of(2022, 11,2)));
		
		
	}
	

	
	
}
	
