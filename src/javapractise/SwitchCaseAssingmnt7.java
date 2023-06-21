package javapractise;

public class SwitchCaseAssingmnt7
{
	public static void main(String[] args)
	{
//		1. WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		
		String vowels = "S";
		switch (vowels)
		{
			case "a":
				System.out.println(vowels + " is a vowel");
				break;
			case "e":
				System.out.println(vowels + " is a vowel");
				break;
			case "i":
				System.out.println(vowels + " is a vowel");
				break;
			case "o":
				System.out.println(vowels + " is a vowel");
				break;
			case "u":
				System.out.println(vowels + " is a vowel");
				break;
			default:
				System.out.println(vowels + " is a consonant");
		}

//		2. WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
		String env = "qA";
		switch (env.toLowerCase().trim())
		{
			case "qa":
				System.out.println("Its QA environment");
				break;
			case "stage":
				System.out.println("Its Stage environment");
				break;
			case "dev":
				System.out.println("Its Dev environment");
				break;
			case "uat":
				System.out.println("Its UAT environment");
				break;
			case "prod":
				System.out.println("Its Prod environment");
				break;
			default:
				System.out.println("Please pass the correct environment name");
		}
		
//		3. WAP to book the specific type of car from the Uber app using Switch - Case. 
//		Car Type: Mini, Sedan, SUV, Premium
//		If user passes wrong car type, print please select the right car type
		
		String cartype = "SUV1";
		switch (cartype.toLowerCase().trim())
		{
			case "mini":
				System.out.println(cartype + " is booked from the Uber app");
				break;
			case "sedan":
				System.out.println(cartype + " is booked from the Uber app");
				break;
			case "suv":
				System.out.println(cartype + " is booked from the Uber app");
				break;
			case "premium":
				System.out.println(cartype + " is booked from the Uber app");
				break;
			default:
				System.out.println("Please select the right car type");
		}
		
//		4. WAP to launch browsers using If-ElseIf and Switch Case.
//		Browser: Chrome/Firefox/IE/Safari
//		If user passes wrong browser, print please pass the right browser name

//		using if-elseif		
		String browser = "Opera";
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Chrome");
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Firefox");
		}
		else if (browser.equalsIgnoreCase("IE"))
		{
			System.out.println("IE");
		}
		else if (browser.equalsIgnoreCase("Safari"))
		{
			System.out.println("Safari");
		}
		else System.out.println("Please pass the right browser name");
		
//		using switch
		String browser1 ="ie";
		switch (browser1.toLowerCase().trim())
		{
			case "chrome":
				System.out.println("Chrome browser is launched");
				break;
			case "firefox":
				System.out.println("Firefox browser is launched");
				break;
			case "ie":
				System.out.println("IE browser is launched");
				break;
			case "safari":
				System.out.println("Safari browser is launched");
				break;
			default: 
				System.out.println("Please pass the right browser name");
		}	

//		5. WAP to define the interest rate on the basis of Loan type using Switch Case
//		Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//		For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		String loanTypes ="housing Loan";
		double salary = 0;
		switch (loanTypes.toLowerCase().trim())
		{
			case "car loan":
				System.out.println("Car Loan");
				break;
			case "housing loan":
				System.out.println("Housing Loan");
				if (salary < 35000)
				{
					System.out.println("NOT APPLICABLE FOR Housing Loan");
				}
				break;
			case "personal loan":
				System.out.println("Personal Loan");
				break;
			case "education loan":
				System.out.println("Education Loan");
				break;
			default: 
				System.out.println("Selected loan type is not available");
		}
	}
}
