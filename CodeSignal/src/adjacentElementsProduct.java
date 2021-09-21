//Given an array of integers, find the highest product obtained by multiplying two adjacent elements
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class adjacentElementsProduct {
	

	int adjacentElementsMultiply(int[] inputArray) {
		
     List<Integer> adjacentProducts = new ArrayList<>();
	     
	for(int i = 0; i<inputArray.length - 1;i++){
	       
	   int num1 = inputArray[i];
	   int num2 = inputArray[i + 1];
	   
	   adjacentProducts.add(num1 * num2);  
	     } 
	Integer max = Collections.max(adjacentProducts);

	return max;
	}
}
