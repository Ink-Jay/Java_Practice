package operator;


public class UniqueNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = { 24, 32, 45, 32, 67, 45, 24 };
		
	  UniqueNumber Numbers = new UniqueNumber (A);
	  
	  
	  System.out.println("The unique number is :" +Numbers.unique(A));
		

	}

}
