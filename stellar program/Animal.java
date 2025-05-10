package training;
import java.util.*;
class Wild
{
	void display(String s1)
	{
		System.out.println(s1);
	}
	void display(String s2)
	{
		System.out.println(s2);
	}
}
public class Animal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		Wild o = new Wild();
		o.display(s1);
		o.display(s2);
	}
}

