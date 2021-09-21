import java.util.Arrays;

public class MakeArrayConsecutive {
	

	int makeArrayConsecutive2(int[] statues) {
	    
	    Arrays.sort(statues);
	    
	    int count = 0;
	for(int i = 0; i <= statues.length-2; i++){
	    int num = statues[i + 1] - statues[i];  
	    
	    int diff = num - 1;
	    if(diff >= 1){
	        count+=num;
	    } 
	    }
	    return count;

	}
}
