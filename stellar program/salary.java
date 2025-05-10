package training;

import java.util.Scanner;

public class Stellar {

	public static void main(String[] args)
	{
		
		        Scanner scanner = new Scanner(System.in);
		        double totalSalary = scanner.nextDouble();
		    
		        
		        int weekendHours = (int) ((totalSalary - 800) / 130);
		        int weekdayHours = weekendHours + 10;
		        
		        System.out.println(weekdayHours);
		        System.out.println(weekendHours);
		    }
		}
