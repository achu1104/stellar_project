package training;
import java.util.*;
abstract class Student 
{ 
	abstract void mark();
	
}
class Score1 extends Student
{
	int a,b,c;
	Score1(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void mark()
	{
		float p = ((a+b+c)/300.0f*100);
		System.out.println(p);
	}
	
}
class Score2 extends Student
{
	int d,e,f,g;
	Score2(int d,int e,int f,int g)
	{
		this.d=d;
		this.e=e;
		this.f=f;
		this.g=g;
	}	
		void mark()
		{
			float q = ((d+e+f+g)/400.0f*100);
			System.out.println(q);
		}
}
public class Percentage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		Student ob;
		ob = new Score1(a,b,c);
		ob.mark();
		ob = new Score2(d,e,f,g);
		ob.mark();
		
	}
	
}
