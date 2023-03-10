package ustbatchno3.junit5testcases;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



	public class Frequencycount {
	
		@Test
		public void counttesting() {
			
			long expected=2;
			long actual=count();
			assertEquals(expected,actual);
			
		}
		public long count() {
			List<String> l1=Arrays.asList("as","df","as");
			long dupe=l1.stream().filter(name->name.equalsIgnoreCase("as")).count();
			return dupe;
			
		}
	}


