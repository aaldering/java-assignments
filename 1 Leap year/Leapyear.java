

import java.io.*;

public class Leapyear{
	public static void main(String[] args) throws Exception{
	 
		System.out.println("Enter a year: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String input = reader.readLine();
	    int year = Integer.parseInt(input);
		if(year%400 == 0 && year%100 == 0){
			System.out.println(year + " is a leap year!");
		} else if(year%4 ==0 && year%100 !=0){
			System.out.println(year + " is a leap year!");
		} else {
			System.out.println(year + " is not a leap year...");
		}
		
	}
}

