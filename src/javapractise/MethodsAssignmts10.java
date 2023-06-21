package javapractise;

public class MethodsAssignmts10
{
// 1. Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user 
// by defining your own method

	static int a, b;
	public int sum(int a, int b)
	{
		int z = a + b;
		return z;
	}
	
	public int substract(int a, int b)
	{
		int z = a - b;
		return z;
	}
	
	public int multiply(int a, int b)
	{
		int z = a * b;
		return z;
	}
	
	public int divide(int a, int b)
	{
		int z = a / b;
		return z;
	}
	
// 2. Define a method that returns the product of two double numbers entered by user.

	public double product(double a, double b)
	{
		double z = a * b;
		return z;
	}
	
// 3. Write a program to print the circumference and area of a circle of radius entered by user by defining your 
// own method.
	
//	c = 2 pi r, a = pi r*r
	double r = 0.0;
	public static double circumferenceOfCircle(double r)
	{
		double circumference = 2 * 3.14 * r;
		return circumference;
	}
	
	public static double areaOfCircle(double r)
	{
		double area = 3.14 * r * r;
		return area;
	}
	
	public static void main(String[] args)
	{
		MethodsAssignmts10 ma = new MethodsAssignmts10();	
		System.out.println(ma.sum(15, 5));
		System.out.println(ma.substract(15, 5));
		System.out.println(ma.multiply(15, 5));
		System.out.println(ma.divide(15, 5));
		
		System.out.println("---------------------------");
		System.out.println(ma.product(15.0, 5.23));
		
		System.out.println("---------------------------");
		circumferenceOfCircle(5.55);
		areaOfCircle(5.55);
	}	
}
