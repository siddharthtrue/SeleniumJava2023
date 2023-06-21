package javapractise;

public class ArithmeticOperations1
{
	public static void main(String[] args)
	{
		System.out.println(4/2);
		System.out.println(4*2);
		System.out.println(4+2);
		System.out.println(4-2);
		
		System.out.println(9/2);
		System.out.println(2/9);
		System.out.println(9.0/2); //if any no. is decimal then 
		// output will be in decimal
		System.out.println(9/2.0);
		System.out.println(9.0/2.0);
		
		System.out.println((float)9/2);
		
		System.out.println(0/9);
//		System.out.println(9/0); //divide by 0 throws exception
//		System.out.println(0/0); //divide by 0 throws exception
		
		System.out.println(9.0/0); // Infinity
// In java, either numerator or denominator is floating or double value and is 
// divided by zero then o/p will be Infinity
// and in case numerator and denominator are int and is divided by zero throws 
// divide by 0 arithmetic exception.
		System.out.println(9/0.0); // Infinity
		System.out.println(9.0/0.0); // Infinity
		System.out.println((float)9/0);  //Infinity
		
		// special case
		System.out.println(0.0/0.0); // NaN (Not a number)
		System.out.println(0.0/0); // NaN
		System.out.println(0/0.0); // NaN
		
		System.out.println(0.0/2.0); // 0.0
		
		System.out.println('a'/2);
		System.out.println(9 % 2);
	}
}
