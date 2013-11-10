package is.ru.TDDExercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UnitTest {

	@Test
	public void TestAdd_EmptyString() 
	{
		assertEquals(StringCalculator.Add(""), 0);
	}
	
	@Test
	public void TestAdd_OneNumber() 
	{
		assertEquals(StringCalculator.Add("1"), 1);
		assertEquals(StringCalculator.Add("2"), 2);
	}
	
	@Test
	public void TestAdd_TwoNumbers()
	{
		assertEquals(StringCalculator.Add("1,1"), 2);
		assertEquals(StringCalculator.Add("1,2"), 3);
		assertEquals(StringCalculator.Add("2,1"), 3);
		assertEquals(StringCalculator.Add("0,0"), 0);
	}
	
	@Test
	public void TestAdd_ManyNumbers()
	{
		assertEquals(StringCalculator.Add("0,0,0"), 0);
		assertEquals(StringCalculator.Add("0,0,1"), 1);
		assertEquals(StringCalculator.Add("0,1,0"), 1);
		assertEquals(StringCalculator.Add("1,0,0"), 1);
		assertEquals(StringCalculator.Add("1,1,1"), 3);
		assertEquals(StringCalculator.Add("1,2,3"), 6);
	}
}