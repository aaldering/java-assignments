

import java.time.*;
import java.time.format.*;
import java.util.*;

public class Quote {
   
	
    	static String[][] quotes = {
    
        {"galileo", "eppur si muove"},
        {"archimedes", "eureka!"},
        {"erasmus", "in regione caecorum rex est luscus"},
        {"socrates", "I know nothing except the fact of my ignorance"},
        {"rené descartes", "cogito, ergo sum"},
        {"sir isaac newton", "if I have seen further it is by standing on the shoulders of giants"}
        
        
    };
    
public static void main(String[] args) {
    	
    	
    	// determine day and month
    	LocalDate localDate = LocalDate.now();
    	DayOfWeek day = localDate.getDayOfWeek();
    	Month currentMonth = localDate.getMonth();
    	
    	int date = localDate.getDayOfMonth();
    	String behindDate = " ";
    	Locale locale = Locale.getDefault();
    	
    	// determine suffix of day
    	if(date == 1 || date == 21 || date == 31 ) {
    		behindDate = "st";
    	} else if (date == 2 || date == 22) {
    		behindDate = "nd";
    	} else if (date == 3 || date == 23) {
    		behindDate = "rd";
    	} else {
    		behindDate = "th";
    	}
    	
    	// select quote based on date
    	int quoteSelector = 0;
    	if(date == 1 || date == 7 || date == 13 || date == 19 || date == 25 || date == 31 ) {
    		quoteSelector = 0;
    	} else if(date == 2 || date == 8 || date == 14 || date == 20 || date == 26 ) {
    		quoteSelector = 1;
    	} else if(date == 3 || date == 9 || date == 15 || date == 21 || date == 27 ) {
    		quoteSelector = 2;
    	} else if(date == 4 || date == 10 || date == 16 || date == 22 || date == 28 ) {
    		quoteSelector = 3;
    	} else if(date == 5 || date == 11 || date == 17 || date == 23 || date == 29 ) {
    		quoteSelector = 4;
    	} else {
    		quoteSelector = 5;
    	}
    	
    	//print first line
    	
    	System.out.println("Quote for " + day.getDisplayName(TextStyle.FULL, locale) + " " + date + behindDate + " of " + currentMonth.getDisplayName(TextStyle.FULL, locale) + ":" );
    	
		
    	//convert first characters to capitals
    	String quoteOfTheDay = Quote.quotes[quoteSelector][1];
        String capitalizeQuote = quoteOfTheDay.substring(0, 1).toUpperCase() + quoteOfTheDay.substring(1);

        String name = Quote.quotes[quoteSelector][0];
        String capitalizeName = name.substring(0, 1).toUpperCase() + name.substring(1);
    	char lastChar = capitalizeQuote.charAt(capitalizeQuote.length() - 1);
    	
    	//print quote and author, add period to quote if last character is letter
        if( Character.isLetter(lastChar)) {
        	System.out.println("\"" + capitalizeQuote + ".\" -- " + capitalizeName);
        } else {
        	System.out.println("\"" + capitalizeQuote + "\" -- " + capitalizeName);
        }
    	
    	
		
    }
}
