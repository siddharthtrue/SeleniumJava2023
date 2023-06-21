package javapractise;

import java.util.Scanner;

public class tp
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an arraylist ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter " + size + " elements ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt(); 
		}
		
		System.out.println("\n List of even numbers in an array are: ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i] + "");
				count++;
			}
		}
		System.out.println("\n Total even numbers count in this array is: " + count);
	}
}
