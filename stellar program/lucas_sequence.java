package training;
import java.util.Scanner;
public class lucas_sequence {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a+b+c;
		for(int i=4;i<num;i++)
		{
			d = c+b+a;
			System.out.println(d+ " ");
			int tmp = c;
			c = d;
			a = b;
			b = tmp;
		}
		
	}

}
