package training;
import java.util.*;
public class string1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str.toLowerCase();
		int count = 0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) == 'a' || str1.charAt(i)== 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'|| str1.charAt(i)=='u');
			count++;
			
		}
		System.out.println(count);
 
		
	}

}
