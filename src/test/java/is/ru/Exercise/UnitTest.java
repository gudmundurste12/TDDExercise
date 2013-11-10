package is.ru.TDDExercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UnitTest {

	
	@Test
	public void TestAdd_EmptyString() {
		assertEquals(StringCalculator.Add(""), 0);
	}
	
	@Test
	public void TestAdd_OneNumber() {
		assertEquals(StringCalculator.Add("1"), 1);
		assertEquals(StringCalculator.Add("2"), 2);
	}
	
	
	
}