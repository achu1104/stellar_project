package training;
import java.util.*;
class Value
{
	void sayHello()
	{
		System.out.println("Hello");
	}
	void sayHello(String s1)
	{
		System.out.println("Hello" +"john");
	}

}
public class Hello
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		Value s = new Value();
		s.sayHello();
		s.sayHello(s1);
	}
}
