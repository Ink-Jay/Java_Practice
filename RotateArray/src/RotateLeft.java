//program to rotate array to the right

import java.util.Arrays;

public class RotateLeft extends RotateRight {

	public RotateLeft(int[] array, int k) {
		super(array, k);
		
	}
	
     	public void RotateL() {
		 
		 if (Array.length == 0) {
			 System.out.println("0");
			 
		 }
		 else {	 
		 for(int i = 0 ; i <  k; i++) {
			 
			int first = Array[0];
			 
			 for(int j =0 ; j <  Array.length -1  ; j++ ) {
				 
				 Array[j] = Array [j + 1];
				 ;
				
		    }
			 Array [Array.length -1] = first;
			 System.out.println("The rotated left array : " + Arrays.toString(Array)); 
			 
		 }
		 
		System.out.println("The rotated left array : " + Arrays.toString(Array));
	 }
	 
	 }
	}
	
	   
	

