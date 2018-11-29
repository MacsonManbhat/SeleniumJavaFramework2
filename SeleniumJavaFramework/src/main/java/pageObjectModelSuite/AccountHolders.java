package pageObjectModelSuite;


public class AccountHolders {
	
	
	
	public static void main(String[] args) {
		
		AccountHolder Tom = new AccountHolder();
		AccountHolder Dick = new AccountHolder();
		AccountHolder Harry = new AccountHolder();
		
	
		
		Harry.firstName = "Harrry";
		Harry.lastName = "Smith";
		Harry.age = 24;
		Harry.accountBalance = 12112312;
		Harry.eigibleForCreditCard = true;
		
		if (Harry.age > 21 && Harry.accountBalance < 300000) {
			
			Harry.eigibleForCreditCard = true;
		} else {
			
			System.out.println(" Sorry you are not eligible to get a credit card yet");
		}
		
	 Dick.age = 55;
	 Dick.firstName = "Tony ";
	 Dick.accountBalance = 10000;
	 Dick.ccEligibility();
	 
	 Tom.age = 34;
	 Tom.firstName = " Evan ";
	 Tom.accountBalance = 12001;
	 
	Tom.ccEligibility();	
		
	}

}
