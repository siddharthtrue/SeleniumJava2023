package javapractise;

import java.util.Scanner;

public class ConditionalOpAssignmnt6
{
	public static void main(String[] args)
	{
//		1. Find out the greatest number out of three different given numbers:
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output: The greatest: 87
		
		int a = 25, b = 78, c = 87;
		if(a > b && a > c)
		{
			System.out.println("The greatest: " + a);
		}
		else if (b > c)
		{
			System.out.println("The greatest: " + b);
		}
		else System.out.println("The greatest: " + c);
		
//		2. Greatest among 25, 78, 87, 97
		
		int a1 = 25, b1 = 78, c1 = 87, d1 = 97;
		if(a1 > b1 && a1 > c1 && a1 > d1)
		{
			System.out.println("The greatest: " + a1);
		}
		else if (b1 > c1 && b1 > d1)
		{
			System.out.println("The greatest: " + b1);
		}
		else if (c1 > d1)
		{
			System.out.println("The greatest: " + c1);
		}
		else System.out.println("The greatest: " + d1);
		
//		3. Write a Java program to test a number is positive or negative.
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number
		
		int number = -11;
		if(number >= 0)
		{
			System.out.println("Positive number");
		}
		else System.out.println("Negative number");
		
//		4. WAP to check number is odd or even using If - Else
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println( num + " is a even number");
		}
		else System.out.println( num + " is a odd number");
		sc.close();
	}
}
