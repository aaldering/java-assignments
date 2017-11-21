


import java.io.*;

public class Fibonacci {
	public static void main (String[] args) throws Exception {
		System.out.println("Give a number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String input = reader.readLine();
	    int fibonacciTerms = Integer.parseInt(input);
	    double a = 0d;
	    double b = 1d;
	    double c = 0d;
	    double sum = 0d;
	    System.out.println("0");
    	System.out.println("1");
	    for(int i = 2; i <= (fibonacciTerms-1); i++) {
	    	c = a + b;
	    	if(c%2==0) {sum = sum + c;}
	    	a = b;
	    	b = c;
	    	
	    	System.out.println(c);
	    }
	    System.out.println("The value of the " + fibonacciTerms + "th term of the Fibonacci sequence is " + c + ".");
	    System.out.println("The sum of the even values of the first " + fibonacciTerms +" terms is " + sum);
	    
	    
	}
}
