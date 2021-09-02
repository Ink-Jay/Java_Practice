import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1920, 05, 07);
		
		int years =Period.between(birthdate, today).getYears();
		int months = Period.between(birthdate, today).getMonths();
		int days = Period.between(birthdate, today).getDays();
		
		System.out.println(today);
		System.out.println(birthdate);
		System.out.print(years + "years ");
		System.out.print(months + "months ");
		System.out.print(days + "days");

	}

}
