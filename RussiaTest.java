package CountryTest;
import com.lessons.task1.Russia;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


/**
 * Created by teacher01 on 11.11.16.
 */

public class RussiaTest {
   @Test
    public static void testCountMen() throws Exception {
    Russia russia = new Russia();
        Integer check = russia.countMen();
        assertNotNull(check);
        Integer check2 = ((60*100)/100)+ russia.getCorrection();
        assertEquals(check,check2);

    }
}