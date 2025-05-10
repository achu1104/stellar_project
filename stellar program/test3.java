package training;
import java.util.Scanner;
public class test3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem,s =0;
		while(n!=0||s>26)
		{
			if(s>26)
			{
				n = s;
				s = 0;
			}
			rem = n%10;
			s = s+rem;
			n = n/10;
		}
		System.out.println((char)(s+64));
	}

}
