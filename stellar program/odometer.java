package training;
import java.util.Scanner;
public class odometer {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
	    float M1 = sc.nextFloat();
		float M2 = sc.nextFloat();
		float M3 = M2 - M1;
		float M4 = M3 * 25;
		
		System.out.println(M4);
		
		
			
		
	}
	
	

}
