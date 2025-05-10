package training;
import java.util.Scanner;
public class upper_triangle 
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[][] = new int[n][n];
	    for(int i =0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		arr[i][j] = sc.nextInt();
	    	}
	    }
	    int sum =0;
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=i;j<n;j++)
	    	{
	    		sum += arr[i][j];
	    	}
	    }
	    System.out.println("sum of upper triangle is:" + sum);
	}
       
}
