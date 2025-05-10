package training;
import java.util.Scanner;
public class test2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int one =0,len = str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='1')
			{
				one++;
			}
		}
		if(one>=(len-one))
		{
			System.out.println("win");
		}
		else
		{
			System.out.println("lose");
		}
	}

}
