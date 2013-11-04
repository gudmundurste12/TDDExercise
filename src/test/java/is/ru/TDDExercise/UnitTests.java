package is.ru.TDDExercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UnitTests {

    @Test
    public void TestAdd() {
        TestAdd_EmptyString();
		TestAdd_OneNumber();
		TestAdd_TwoNumbers();
    }
	
	public void TestAdd_EmptyString()
	{
		assertEquals(StringCalculator.Add(""), 0);
	}
	
	public void TestAdd_OneNumber()
	{
		assertEquals(StringCalculator.Add("1"), 1);
		assertEquals(StringCalculator.Add("2"), 2);
	}
	
	public void TestAdd_TwoNumbers()
	{
		
	}
	
}