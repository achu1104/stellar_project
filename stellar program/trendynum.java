package training;
import java.util.Scanner;
public class trendynum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num / 10;
		int b = a%10;
		if(b%3 == 0)
		{
			System.out.println(num + "is trendy num");
		}
		else
		{
			System.out.println(num + "not a trendy num");
		}
	}

}
