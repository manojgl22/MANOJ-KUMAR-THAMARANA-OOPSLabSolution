package employyeinfo;

public class MailMain {
	import java.util.Scanner;

	import employyeinfo.EmployeeDetails;

	public class MainMail {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char[] password;
			
			
			String strGenerateEmailId;
			Scanner sc=new Scanner(System.in);
			String strFirstName;
			String strLastName;
			System.out.println("Enter your First Name");
			strFirstName=sc.nextLine();
			System.out.println("Enter your Last Name");
			strLastName=sc.nextLine();
			CredentialService credentialService = new CredentialService();
			EmployeeDetails empDetails=new EmployeeDetails(strFirstName,strLastName);
			
			System.out.println("Select Department from below options");
			
			System.out.println("1.Technical");
			
			System.out.println("2.Admin");
			
			System.out.println("3.HR");
			
			System.out.println("4.Legal");		
		
			
			
			
		}

	}

}
