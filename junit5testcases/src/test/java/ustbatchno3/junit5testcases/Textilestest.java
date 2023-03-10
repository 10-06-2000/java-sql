package ustbatchno3.junit5testcases;
package junittestcase.garments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

/**
 * Unit test for simple App.
 */

  public class Textilestest {
    @Test
    public void testGarmentSaleAnalyzer() {
        List<GarmentProduct> garments = new ArrayList<>();
        garments.add(new Textilestest("t-Shirt", 10, 500, LocalDate.of(2023, 3, 10)));
        garments.add(new Textilestest("Pants", 5, 200, LocalDate.of(2023, 3, 10)));
        garments.add(new GarmentProduct("Shirt", 5, 250, LocalDate.of(2023, 3, 9)));
        garments.add(new GarmentProduct("Shirt", 5, 500, LocalDate.of(2023, 3, 10)));


        GarmentSaleAnalyzer analyzer = new GarmentSaleAnalyzer(garments);

        Map<String, Double> result = analyzer.analyze(LocalDate.of(2023, 3, 10));

        //assertEquals(2, result.size());
        assertEquals(2500, result.get("Shirts"), 0);
        //assertEquals(1000, result.get("Pants"), 0);
    }
}

  

public class Textilestest {

}
