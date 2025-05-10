package training;
import java.util.*;
abstract class Shape 
{
	abstract void rectangleArea(int l,int b);
	abstract void squareArea(int a);
	abstract void circleArea(int r);
}
class Area extends Shape
{
	void rectangleArea(int l,int b)
	{
		System.out.println(l*b);
	}
	void squareArea(int a)
	{
		System.out.println(a*a);
	}
	void circleArea(int r)
	{
		System.out.println((double)22.7*(r*r));
	}
}
public class Pro2
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int a = sc.nextInt();
		int r = sc.nextInt();
		Shape s = new Area();
		s.rectangleArea(l,b);
		s.squareArea(a);
		s.circleArea(r);
	}
}

