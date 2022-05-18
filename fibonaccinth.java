import java.util.*;
public class fibonaccinth
{
    public static int fibonacci(int n)
    { if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main (String args[])
    { int n;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Value of n: ");
        n=scnr.nextInt();
        System.out.println("The placed "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}
