package training;
import java.util.Scanner;
public class arr_sum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt(); 
		}
		for(int i =0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i =0;i<n;i++)
		{
			sum = arr[i] + sum;
			System.out.println("the sum is:"+ sum);
			
		}
		//calculate average
		double average = (double) sum / n;
		System.out.println("the avg is:" + average);
	}

}
