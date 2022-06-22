package employeeinfoService;

import java.util.Random;

import employyeinfo.EmployeeDetails;

public class CredentialService{

	public char[] generatePassword() {
		
		String strCapitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strSmallLetters="abcdefghijklmnopqrstuvwxyz";
		String strNumbers="0123456789";
		String strSpCharcters="!@#$%&*()_+-=";
		
		String strValues=strCapitalLetters+strSmallLetters+strNumbers+strSpCharcters;
		
		Random rd=new Random();
		
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
		
		password[i]=strValues.charAt(rd.nextInt(strValues.length()));
		
		
		}
		
		return password;
		
	}
	
	public String generateMailid(String strFirstName,String strLastName,String strDepartment) 
	{
		String strEmailId=strFirstName+ strLastName+"@"+strDepartment+".abc.com";
		
		return strEmailId;
		}
	
	public void showCredentials(EmployeeDetails empDetails,String strEmailId,char[]password) {
		
		System.out.println("Dear "+ empDetails.getStrFirstName()+ empDetails.getStrLastname()+"Your Email Id is generated");
		
		System.out.println("Email Id"+strEmailId);
		
		System.out.println("Password>>>");
		
		System.out.println(generatePassword());
		
		
	}
	
		
		

}
