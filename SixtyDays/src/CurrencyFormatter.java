import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormatter {

	public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter amount to be formatted:" );
		 double amount = input.nextDouble();
		 input.close();
		 
		 String US = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
		 String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amount);
		 String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
		 String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
		 
		 
		 System.out.println("US :"+ US );
		 System.out.println("INDIA :"+ india );
		 System.out.println("CHINA :"+ china );
		 System.out.println("FRANCE :"+ france );

	}

}
