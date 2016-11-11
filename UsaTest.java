package CountryTest;

import com.lessons.task1.Usa;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by teacher01 on 11.11.16.
 */
public class UsaTest {
    @Test
    public static void testCountMen() throws Exception {
        Usa usa = new Usa();
        Integer check = usa.countMen();
        assertNotNull(check);
        Integer check2 = ((110*100)/200)+ usa.getCorrection();
        assertEquals(check,check2);
    }
}