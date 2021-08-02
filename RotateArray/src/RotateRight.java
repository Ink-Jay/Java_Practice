//program to rotate array to the right
// each element is shifted right by one index, and the last element of the array is moved to the first place
//the Array is rotated a certain number of times

import java.util.Arrays;

public class RotateRight {
	
	protected int [] Array;
	protected int k;
	
	   public RotateRight(int[] array, int k) {
		   Array = array;
		   this.k = k;
	     }

	   public int[] getArray() {
		  return Array;
	      }

	   public void setArray(int[] array) {
		   Array = array;
	      }

	   public int getK() {
		   return k;
	      }

	   public void setK(int k) {
		  this.k = k;
	     } 
	   
	 public void RotateR() {
		 
		 if (Array.length == 0) {
			 System.out.println("0");
			 
		 }
		 else {	 
		 for(int i = 0 ; i <  k; i++) {
			 
			int last = Array[Array.length -1];
			 
			 for(int j = Array.length -1 ; j > 0  ; j-- ) {
				 
				 Array[j] = Array [j - 1];
				 ;
				
		    }
			 Array [0] = last;
			 System.out.println("The rotated right array : " + Arrays.toString(Array)); 
			 
		 }
		 
		System.out.println("The rotated right array : " + Arrays.toString(Array));
	 }
	 
	 }
	
	
	
	

}
