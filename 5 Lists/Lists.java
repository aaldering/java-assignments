

import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		int[] array = new int[10];
		int highest = 0;
		int lowest = 100;
		int secondLowest = 101;
		for(int i = 0; i < 10; i++) {
			array[i]  = (int) (Math.random()*100);
			System.out.println(array[i]);
		}
		//display highest number	
		for(int k=0; k < 10; k++) {
			if(highest < array[k]){
				highest = array[k];
			} 
		
		}
		System.out.println("The highest number is " + highest);
		
		//display lowest two numbers, run twice: one for lowest and one time for secondlowest
		for(int l =0; l < 10; l++) {
			if(array[l] < lowest) {
				lowest = array[l];
			}
			for(int m = 0; m < 10; m++) {
				if(array[m] < secondLowest && array[m]>lowest) {
					secondLowest = array[m];
				}
			}
		}
			
		System.out.println("The lowest number is " + lowest);
		System.out.println("The second lowest number is " + secondLowest);	
		
		//filter even numbers
		System.out.println("Numbers divisible by 2:");
		for(int m = 0; m < 10; m++) {
			ArrayList<Integer> div2 = new ArrayList<Integer>();
			if(array[m]%2==0) {
				div2.add(array[m]);
				System.out.println(div2);
			}
		}
		
		//split
		System.out.println("Numbers divisible by 3:");
		for(int m = 0; m < 10; m++) {
			ArrayList<Integer> div3 = new ArrayList<Integer>();
			if(array[m]%3==0) {
				div3.add(array[m]);
				System.out.println(div3);
			}
		}
		System.out.println("Numbers divisible by 5:");
		for(int m = 0; m < 10; m++) {
			ArrayList<Integer> div5 = new ArrayList<Integer>();
			if(array[m]%5==0) {
				div5.add(array[m]);
				System.out.println(div5);
			}
		}
		System.out.println("Numbers not divisible by 2,3 & 5:");
		for(int m = 0; m < 10; m++) {
			ArrayList<Integer> nodiv235 = new ArrayList<Integer>();
			if(array[m]%2!=0 && array[m]%3!=0 && array[m]%5!=0 ) {
				nodiv235.add(array[m]);
				System.out.println(nodiv235);
			}
		}
		//bubble sort
		for(int i=0;i<array.length;i++) {
			for(int j =1; j<(array.length-i);j++){
				  if(array[j-1] > array[j]){
                      
                      int temp = array[j-1];
                      array[j-1] = array[j];
                      array[j] = temp;
                      
				  }
				  
			}
		}
		System.out.println("Sorting with bubblesort!");
		for(int x = 0; x < 10; x++) {
			 
			System.out.println(array[x]);
			  }
		
		
		System.out.println("K thnx bye!");
		
		
	}
	
}



