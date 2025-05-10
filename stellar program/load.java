package training;
import java.util.*;
class Overload1 
{
	void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	void mul(int c,int d,int e)
	{
		System.out.println(c*d*e);
	}	
}
public class load
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	Overload1 o = new Overload1();
	o.mul(a,b);
	o.mul(c,d,e);
}
}