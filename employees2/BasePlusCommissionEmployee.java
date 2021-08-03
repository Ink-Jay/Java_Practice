package employees2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	  
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String idNumber, double grossSales,
			double commissionRate ,double baseSalary ) {
		
		super(firstName, lastName, idNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
		 
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
    	return super.earnings() + baseSalary; }
	
	@Override
    public String toString() {
        	return super.toString() + "\nBase salary : " +baseSalary;
	}

}
