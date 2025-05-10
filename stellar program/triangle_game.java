package training;
import java.util.Scanner;
public class triangle_game {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c == 180)
		{
			System.out.println("prize 1");
		}
		else if(a==b || a==c || b==c)
		{
			System.out.println("prize 2");
		}
			
	}

}
