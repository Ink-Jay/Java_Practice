package operator;

// * A ^ A = 0
// * A ^ 0 = A
// * A ^ B ^ C = A ^ C ^ B


public class UniqueNumber {
	
	  private int [] Array;
	
      public UniqueNumber(int[] array) {
		Array = array;
	}

	
	 public int[] getArray() {
		return Array;
	}


         public void setArray(int[] array) {
		Array = array;
	}

	
	//method to find the unique number in an array
	public int unique(int numbers []) {
		
		int singleNumber = numbers[0];
		
		//loops through the array XORing the elements 
		for(int i = 1; i < numbers.length; i++) {
			
			singleNumber = singleNumber ^ numbers[i];
		}
		
		return singleNumber;
	}

}
