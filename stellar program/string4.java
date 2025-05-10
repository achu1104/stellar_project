package training;
import java.util.Scanner;
public class string4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		

	}

}
