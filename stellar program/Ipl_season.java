package training;
import java.util.Scanner;
public class Ipl_season {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int date = sc.nextInt();
		if(month == 1)
		{
			if(date<=19)
			{
				System.out.println("capricon");
			}
			else
			{
				System.out.println("aquarius");
			}
		}
		else if(month == 2)
		{
		 if(date <= 18)
		{
			System.out.println("aquarius");
		}
		 else
		 {
			 System.out.println("pisces");
		 }
		}
		else if(month == 3)
		{
			if(date <=20)
			{
				System.out.println("pisces");
			}
			else
			{
				System.out.println("aries");
			}
		}
		else if(month == 4)
		{
			if(date <= 19)
			{
				System.out.println("aries");
			}
			else
			{
				System.out.println("taurus");
			}
			
		}
		else if(month == 5)
		{
			if(date <=20)
			{
				System.out.println("taurus");
			}
			else
			{
				System.out.println("gemini");
			}
		}
		else if(month == 6)
		{
			if(date <= 20)
			{
				System.out.println("gemini");
			}
			else
			{
				System.out.println("cancer");
			}
		}
		else if(month == 7)
		{
			if(date <=22)
			{
				System.out.println("cancer");
			}
			else
			{
				System.out.println("leo");
			}
		}
		else
		{
			System.out.println("stop the program");
		}
				
	}

}
