package gap;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner read = new Scanner(System.in);
				
		 System.out.println("Enter the interger");
				
		   int N = read.nextInt();
				
		   String n = Integer.toBinaryString(N);
		   System.out.println("The binary form is " + n);

			    int length = n.length();
			    System.out.println("The length is " + length);

			   int highest = 0;
			   int zeroCounter = 0;
			   
			   for(int i = 0; i < length; i++) {
				   
				   if(n.charAt(i) == '1') {
					   if(highest < zeroCounter) {
						   highest = zeroCounter;
					   }
					 
					   zeroCounter = 0;
				   }
				   
				   else {
					   zeroCounter ++;
				   }
			   }
			   
			   System.out.println("The gap is : " + highest );

			   
			   read.close();
			}

	}


