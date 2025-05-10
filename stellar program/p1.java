package training;
import java.util.*;
class Bicycle
{
		int gear;
		int speed;
		Bicycle(int gear,int speed)
		{
			this.gear=gear;
			this.speed=speed;
		}
	void display()
	{
		System.out.println("no of gear are:" +gear);
		System.out.println("speed of bicycle:" +speed);
	}
}	

	class MountainBike extends Bicycle
	{
		int seatheight;
		MountainBike(int gear,int speed,int seatheight){
			super(gear,speed);
			this.seatheight = seatheight;
		}
		
	void show()
	{
		display();
		System.out.println("seat height is:" +seatheight);
	}
	}

	public class p1
	{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int gear = sc.nextInt();
		int speed = sc.nextInt();
		int seatheight = sc.nextInt();
		MountainBike m = new MountainBike(gear,speed,seatheight);
		m.show();
	}
	}


