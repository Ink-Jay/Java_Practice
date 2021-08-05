package sumofCubesisSquareofsum;

import java.util.Scanner;
import java.lang.Math;

public class SumofCubesisSquareofSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the value of n:");
		
		n = read.nextDouble();
		
		double side1 = 0 ;
		for(int k = 1; k <= n; k++) {
			side1 = side1 + Math.pow(k,3);
		}
		System.out.printf("The sum of Cubes is : %.2f", side1);
		
		double side2 = 0;
		for(int k =1 ; k <= n; k++) {
			double sum = 0;
			sum = sum + k;
			side2 = Math.pow(sum, 2);
		}
		System.out.printf("\nThe square of sum is : %.2f", side2);
		
		if(side1 == side2) {
			System.out.printf("\nThe equation is valid at n = %.2f since both sides are equal", n);
		}
		else {
			System.out.printf("\nThe equation is not  valid at n = %.2f since both sides are not equal", n);
		}
		
	read.close();

	}

}
