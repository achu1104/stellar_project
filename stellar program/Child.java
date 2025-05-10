package training;
import java.util.*;
class Parent {
    int a;
    int b;
    int add;
    
    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        this.add = a + b;
    }
    
    void display(){
        System.out.println("Addition of 2 integers: " + add);
    }
}

class Child1 extends Parent {
    int sub;

    Child1(int a, int b) {
        super(a, b); 
        this.sub = a - b;
    }

   
    void show() {
        System.out.println("Subtraction of 2 integers: " + sub);
    }
}

class Child2 extends Child1 {
    int mul;

    Child2(int a, int b) {
        super(a, b);
        this.mul = a * b;
    }
    void give() {
  
        System.out.println("Multiplication of 2 integers: " + mul);
    }
}
class Child3 extends Child2
{
	int div;
	Child3(int a,int b)
	{
		super(a,b);
		this.div = a/b;
	}
	void display1()
	{
		display();
		show();
		give();
		System.out.println("division of 2 integers:" +div);
	}
}

public class Child {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
 
        Child3 c = new Child3(a, b);
        c.display1();


    }
}