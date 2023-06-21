package javapractise;

public class LoopsAssignment8
{
	public static void main(String[] args)
	{
// 1. WAP to print following output: 
// I am Batman
// I am Batman
// I am Batman
// I am Batman
// I am Batman
		
		int i = 1;
		while(i <= 5)
		{
			System.out.println("I am Batman");
			i++;
		}
		
// 2. WAP to print following output:
// I am Batman 1
// I am Batman 2
// I am Batman 3
// I am Batman 4
// I am Batman 5
// I am Batman 6
// I am Batman 7
// I am Batman 8
// I am Batman 9
		
		int j = 1;
		while(j <= 9)
		{
			System.out.println("I am Batman " + j);
			j++;
		}
		
// 3. WAP to print 10 to 1 using for, while and do-while loop
		
		for(int k = 10; k >= 1; k--)
		{
			System.out.println(k);
		}
		
		int x = 10;
		while (x >= 1)
		{
			System.out.println(x);
			x--;
		}
	System.out.println ("-----------------------------");	
		int y = 10;
		do
		{
			System.out.println(y);
			y--;
		}while(y>=1);
		
// 4. Write a program in Java to print "Hello World" ten times using while loop
		
		int s = 1;
		while (s <= 10)
		{
			System.out.println("Hello World");
			s++;
		}

// 5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
		System.out.println("--------While loop---------");
		int num = 1;
		while(num <= 100)
		{
			if(num % 5 == 0)
			{
				System.out.print(" " + num);
			}
			num++;
		}
		
		System.out.println();
		System.out.println("-----------Do while loop----------");
		
		int num1 = 1;
		do
		{
			if(num1 % 5 == 0)
			{
				System.out.print(" " + num1);
			}
			num1++;
		}while(num1 <= 100);
		
		System.out.println();
		System.out.println("-----------For loop--------------");
		
		for(int k = 1; k <= 100; k++)
		{
			if(k % 5 == 0)
			{
				System.out.print(" " + k);
			}
		}
		
// 6. Print all odd and even numbers between 1 to 100
		System.out.println();
//		for(int l = 1; l <= 100; l++)
//		{
//			if(l % 2 == 0)
//				System.out.println(l + " is an even number");
//			else
//				System.out.println(l + " is an odd number");
//		}
		System.out.println();
		System.out.println("Even numbers: ");
		int m = 1, o = 1;
		while(m <= 100)
		{
			if(m % 2 == 0)
			{
				System.out.print(m + " ");
			}
			m++;
		}
		
		System.out.println();
		System.out.println("Even numbers: ");
		while(o <= 100)
		{
			if(o % 2 != 0)
			{
				System.out.print(o + " ");
			}
			o++;
		}
		
// 7. Print A-Z, a-z, 0-9 with the respective ASCII numbers the console one using while and for loop.
		System.out.println();
		System.out.println("-------------------------------------------");
		char ch = 'A', ch1 = 'a'; int p = 0;
		while(ch <= 'Z' && ch1 <= 'z')
		{
			System.out.println(ch + " = " + (byte)ch + " ");
			System.out.println(ch1 + " = " + (byte)ch1 + " ");
			ch++;
			ch1++;
			if(p <= 9)
			{
				System.out.println(p);
				p++;
			}
			System.out.println("**********");
		}
		
		// Using for loop
		for(char chr = 'A'; chr <= 'Z'; chr++)
		{
			System.out.println(chr + " = " + (byte)chr + " ");
		}
		for(char chr1 = 'a'; chr1 <= 'z'; chr1++)
		{
			System.out.println(chr1 + " = " + (byte)chr1 + " ");
		}
		for(int p1 = 0; p1 <= 9; p1++)
		{
			System.out.println(p1);
		}

//	8. Print the following series: 
//	1.0 2.0 3.0  ...... 10.0 
//	0 9 18 27 36 …99
		
		System.out.println(". .... ... ... ... .");
		for(double d = 1.0; d <= 10.0; d++)
		{
			System.out.print(" " + d);
		}
		System.out.println();
		
		for(int d1 = 0; d1 <= 99; d1=d1+9)
		{
			System.out.print(" " + d1);
		}
		
// 9. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		System.out.println();
		System.out.println("======================================");
		// Using for loop
		for(char c1 = 'a'; c1 <= 'z'; c1++)
		{
			if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')
			{
				System.out.println("Vowels are: " + c1);
			}
		}
		
		// Using while loop
		System.out.println("================xxxxxxxxxxxxx======================");
		char c = 'a';
		while(c <= 'z')
		{
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				System.out.println("Vowels are: " + c);
			}
			c++;
		}
		
// 10. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		System.out.println();
		System.out.println("======================================");
		for(int q = 1; q <= 10; q++)
		{
			System.out.println(q);
			if(q % 7 == 0)
			{
				System.out.println("bye, see you tomorrow.");
				break;
			}
		}
	}
}
