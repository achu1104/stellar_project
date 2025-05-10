package training;
import java.util.Scanner;
public class string8 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(s1.tocompare(s2));
		if(s1 == s2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
