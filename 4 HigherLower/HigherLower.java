

import java.io.*;

public class HigherLower {
	public static void main (String[] args) throws Exception {
	
		int answer = (int) (Math.random()*50);
		int guess = 0;
		int count = 0;
		System.out.println("I've got a number in mind between 0 and 50. What's your guess?");
		while(answer != guess) {
			System.out.println("Enter a number: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			
			guess = Integer.parseInt(input);
			if(guess<0 || guess > 50) {
				System.out.println("Choose a number between 0 and 50. The program will restart.");
				continue;
			}
			if(answer == guess) {
				System.out.println("Correct!");
				System.out.println("You have won!");
				return;
			} else if(answer < guess) {
				System.out.println("Lower");
			} else {
				System.out.println("Higher");
			}
			count++;
			if(count == 10) {
				System.out.println("You had " + count + " tries. Sorry bro...");
				System.out.println("The correct answer was " + answer + ".");
				return;
			}
    
		}
	}
}


