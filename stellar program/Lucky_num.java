package training;
import java.util.*;
public class Lucky_num
{
	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter String:");
	        String a = sc.nextLine();
	        
	        int sum = 0;
	        
	        for (char ch : a.toCharArray()) 
	        {
	            if (Character.isLetter(ch)) 
	            {
	                sum += Character.toLowerCase(ch) - 'a' + 1;
	            }
	        }
	        
	        
	        int root = root(sum);
	        
	        System.out.println("Output: " + root);
	    }

	   
	    public static int root(int num)
	    {
	        while (num > 9)
	        {
	            int temp = 0;
	            while (num > 0) 
	            {
	                temp += num % 10;
	                num /= 10;
	            }
	            num = temp;
	        }
	        return num;
	    }
	}


