package training;
import java.util.*;

abstract class Div {
    abstract void getValue();
    abstract int divisorSum(int n); 
}

class Math extends Div {
    int n;

    Math(int n) {
        this.n = n;
    }

    void getValue() {
        System.out.println("num: " + n);
    }

    
    int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { 
            if (n % i == 0) {
                sum += i; 
            }
        }
        return sum;
    }
}

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Div ob = new Math(n);
        ob.getValue();
        System.out.println("Sum of divisors: " + ob.divisorSum(n)); 
    }
}