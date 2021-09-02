/* A small frog wants to get to the other side of the road. 
 * The frog is currently located at position X and wants to get to a position greater than or equal to Y. 
 * The small frog always jumps a fixed distance, D.
 *Count the minimal number of jumps that the small frog must perform to reach its target.

*/



import java.util.*;

public class FrogJump {

	public static void main(String[] args) {
		
		int count = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the current position");
		int X = input.nextInt();
		
		System.out.println("Enter the  fixed jumping distance");
		int D = input.nextInt();
		
		System.out.println("Enter the approximate final position ");
		int Y = input.nextInt();
		
		int distance = Y - X;
		
		if(distance % D == 0) {
			count = distance / D;
		}
		else {
			count = (distance / D ) + 1;
		}
		
		System.out.println("Minimal number of jumps:" + count);
			
       input.close();
	}

}

/* Time complexity (line 31 -38) O(1) */