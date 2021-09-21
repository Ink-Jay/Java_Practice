/* Given a sequence of integers as an array, determine whether it is possible 
 * to obtain a strictly increasing sequence by removing no more than
 * one element from the array. */

public class AlmostIncreasing {
	
	boolean almostIncreasingSequence(int[] sequence) {
	
	int num = 0;
    for (int i = 0; i < sequence.length - 1; i++) {
        if (sequence[i] - sequence[i+1] >= 0) {
            num += 1;
            
        if (i - 1 >= 0 && i + 2 <= sequence.length - 1
               && sequence[i] - sequence[i+2] >= 0
               && sequence[i-1] - sequence[i+1] >= 0) {
                return false;
            }
        }
    }
    
    return num <= 1;
	}
}
