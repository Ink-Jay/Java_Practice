//Given an array of integers, find the highest product obtained by multiplying two adjacent elements
public class AdjacentTest {

 public static int adjacentElementsMultiply(int[] inputArray) {
		
		if(inputArray.length <= 0) {
			return 0;
		}
			int product = 0;
			
			 for(int i = 0; i < inputArray.length - 1; i++) {
				int curProduct = inputArray[i] * inputArray[i + 1];
				
				   if (curProduct > product) {
					   product = curProduct;
				   }
			}
			return product;
		

	}

}
