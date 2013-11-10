package is.ru.TDDExercise;
import java.lang.*;

public class StringCalculator {
    
	public static int Add(String numbers) {
		if(numbers.equals("")) {
			return 0;
		}
		else {
			String[] theStrings = numbers.split(",");
			if(theStrings.length == 1)
			{
				return ParseInt(theStrings[0]);
			}
			else
			{
				return ParseInt(theStrings[0]) + ParseInt(theStrings[1]);
			}
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