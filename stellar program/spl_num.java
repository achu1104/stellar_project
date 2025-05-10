package training;
import java.util.Scanner;
public class spl_num {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start num:");
		int a = sc.nextInt();
		System.out.println("enter end num:");
		int b = sc.nextInt();
		for (int i = a;i <= b;i++)
		{
			int m=i/10;
			int n=i%10;
			int c = m+n;
			int d = m*n;
			int e = c+d;
			if(e == i)
			{
				System.out.println(i);
			}
		}
	}

}
