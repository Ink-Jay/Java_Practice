package employees2;

public class CommissionEmployee extends Employees {
	
	private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, String idNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, idNumber);
		
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
    }

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double earnings() {
    	return grossSales * commissionRate;
    }
	
	@Override
	 public String toString() {
	    	return super.toString() + "\nGross Sales : " + getGrossSales() + "\nCommission Rate : "+ getCommissionRate()+ 
	    			"\nEarnings : " + earnings() 
	    	;
    
    

}
}
