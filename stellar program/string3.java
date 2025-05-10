package training;
import java.util.Scanner;
public class string3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reversed = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(reversed))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
		

	}

}
