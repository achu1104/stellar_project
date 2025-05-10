package training;
import java.util.Scanner;
public class sumofrow_col 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	
		int row = arr.length;
		int col = arr[0].length;
		
		//sum of row
		System.out.println("\n sum of row:");
		for(int i=0;i<row;i++)
		{
			int rowsum = 0;
			for(int j=0;j<col;j++)
			{
				rowsum += arr[i][j];
			}
			System.out.println("row" +(i+1)+ ":" +rowsum);
		}
		
		//sum of col
		System.out.println("sum of col:");
		for(int j=0;j<col;j++)
		{
			int colsum = 0;
			for(int i=0;i<row;i++)
			{
				colsum += arr[i][j];
				System.out.println("col" +(j+1)+ ":" +colsum);
			}
		}
	}

}
