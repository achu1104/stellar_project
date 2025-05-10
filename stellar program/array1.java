package training;
import java.util.Scanner;
public class array1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 1;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			p = p*a[i];
			System.out.println(p);
		}
	}

}
