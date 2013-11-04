package is.ru.TDDExercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UnitTests {

    @Test
    public void TestAdd() {
        
		assertEquals(StringCalculator.Add(""), 0);
		
		assertEquals(StringCalculator.Add("1"), 1);
		assertEquals(StringCalculator.Add("2"), 2);
    }
}