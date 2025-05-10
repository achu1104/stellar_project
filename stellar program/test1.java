package training;
import java.util.Scanner;
public class test1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]= new int[n][n];
		int k = 0;
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
				if(a[i][j]<11)
				{
					k += a[i][j];
				}
			}
		}
		System.out.println(k);
		
	}

			
}
