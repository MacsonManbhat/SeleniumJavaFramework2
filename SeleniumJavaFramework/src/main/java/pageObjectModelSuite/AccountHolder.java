package pageObjectModelSuite;

public class AccountHolder {

	String firstName;
	String lastName;
	int age;
	double accountBalance;
	boolean eigibleForCreditCard;
	
	
	
	public void ccEligibility ()	{
		
		if (age>35 || accountBalance <  12000) {
			
			System.out.println(this.firstName + "You are missing the criterion but lets get you a credit card to make your life better");
			
		} else {
			
			System.out.println(this.firstName +" Sorry You are ineligble to get a Credit Card");
		}
		
	}
	
}
