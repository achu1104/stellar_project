package training;
import java.util.*;
class Check
{
	public void fun1(int a,int b)
	{
		System.out.println(a+b);
	}
	public void fun1(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	public void fun1()
	{
		System.out.println("wrong input");
	}
}
public class function
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		Check ch = new Check();
		if(n == 2)
		{
			ch.fun1(a,b);
		}
		else if(n == 3)
		{
			int c = sc.nextInt();
			
			ch.fun1(a,b,c);
		}
		else 
		{
			ch.fun1();
		}

	}
}
