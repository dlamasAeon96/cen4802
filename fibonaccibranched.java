import java.util.*;
/** David Lamas Author */
public class fibonaccibranched
{
    //method that returns the n-th fibonacci sequence
    public static int fibonacci(int n)
    //if is 1 or less return a factor n
    { if (n <= 1)
            return n;
        //Call the fibonacci in recursive fashion
        return fibonacci(n-1) + fibonacci(n-2);
    }
    //main method
    public static void main (String args[])
    //declare a variable for n
    { int n;
        //create scanner object class
        Scanner scnr=new Scanner(System.in);
        //acquire the value of n from the user
        System.out.println("Value of n: ");
        n=scnr.nextInt();
        //print the n-th number in sequence
        System.out.println("The placed "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}
