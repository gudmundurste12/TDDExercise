package is.ru.TDDExercise;
import java.lang.*;

public class StringCalculator 
{	
	public static int Add(String numbers) 
	{
		if(numbers.equals("")) 
		{
			return 0;
		}
		else 
		{
			String[] theStrings = numbers.split(",");
			int returnValue = 0;
			for(String s : theStrings)
			{
				returnValue += ParseInt(s);
			}
			
			return returnValue;
		}
	}
		
	public static int ParseInt(String theString)
	{
		return Integer.parseInt(theString);
	}
		
/*        
	public static void main(String[] args) {
		
}
*/
}