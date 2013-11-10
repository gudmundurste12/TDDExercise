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
				return Integer.parseInt(theStrings[0]);
			}
			else
			{
				return Integer.parseInt(theStrings[0]) + Integer.parseInt(theStrings[1]);
			}
		}
	}
	
/*	
	public static void main(String[] args) {
    	
    }
*/
}