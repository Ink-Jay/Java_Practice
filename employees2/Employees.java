//Deitel and Deitel Ex. 9.14, 9.15

package employees2;

public class Employees {
	
	private String firstName;
	private String lastName;
	private String idNumber;
	
	
	public Employees(String firstName, String lastName, String idNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\n%s : %s ", firstName, lastName, "ID Number", idNumber);
}
}
