package training;
import java.util.Scanner;
public class string2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int position = 0;
		int length = str.length();
		for(int i=0;i<length;i++)
		{
			if(length%2 == 0)
			{
				position = length/2-1;
				length = 2;
			}
			else
			{
				position = length/2;
				length = 1;
			}
			System.out.println(position);
		}
		
		

	}

}
