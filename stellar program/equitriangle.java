package training;
import java.util.Scanner;
public class equitriangle 
{
     public static void main(String[] args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 int s = sc.nextInt();
    	 float Area = (float) (Math.sqrt(3)/4) * s * s;
    	 
    	 System.out.printf("%.2f\n",Area);
     }
}
