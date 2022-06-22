package employyeinfo;

public class EmployeeDetails{
	private String strFirstName;
	private String strLastname;
	
	public String getStrFirstName() {
		return strFirstName;
	}

	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}

	public String getStrLastname() {
		return strLastname;
	}

	public void setStrLastname(String strLastname) {
		this.strLastname = strLastname;
	}
	
	public EmployeeDetails(String FirstName,String LastName) {
		
		this.strFirstName=FirstName;
		this.strFirstName=LastName;
	}
	
	}

