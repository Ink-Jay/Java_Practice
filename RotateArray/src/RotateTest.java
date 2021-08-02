import java.util.Arrays;
public class RotateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] A = {7, 9, 3, 2, 8, 19};   
      System.out.println("The original Array : " + Arrays.toString(A));
      RotateRight Test = new RotateRight(A, 2);
      RotateLeft Test2 = new RotateLeft(A,2);
      Test.RotateR();
      Test2.RotateL();
      
      
	}

}
