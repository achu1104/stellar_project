package training;

import java.util.Scanner;

public class sum_diagonal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int a=0,b=0;
		for(int i=0;i<n;i++)
		{
		a += arr[i][i];
		b += arr[i][n-1-i];
		}
		if(n % 2 !=0)
		{
			b -= arr[n/2][n/2];
		}
		System.out.println("the sum of a :"+ a);
		System.out.println("the sum of b :"+ b);
				
	}

}
