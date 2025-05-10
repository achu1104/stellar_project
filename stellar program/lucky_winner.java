package training;
import java.util.Scanner;
public class lucky_winner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a%10;
		if(b == 8 || b == 3)
		{
			System.out.println("lucky winner");
		}
		else
		{
			System.out.println("not a winner");
		}
	}

}
