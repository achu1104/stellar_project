package training;
i2mport java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class calender {
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        
	       
	        LocalDate firstDay = LocalDate.of(year, 1, 1);
	        DayOfWeek dayOfWeek = firstDay.getDayOfWeek();
	        
	       
	        System.out.println("The first day of " + year + " is " + dayOfWeek);
	}

}
