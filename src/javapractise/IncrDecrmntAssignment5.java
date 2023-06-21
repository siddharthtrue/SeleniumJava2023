package javapractise;

public class IncrDecrmntAssignment5
{
	public static void main(String[] args)
	{
/////// Incremental/ Decremental Operators:
		
//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//		Expected Output :
//		Hello 
//		Naveen K
		
		System.out.println("Hello");
		System.out.println("Siddharth");
		
//		2. Write a Java program to print the sum of two numbers.
//		Test Data:
//		 74 + 36 
//		Expected Output:
//		110
		int a = 74;
		int b = 36;
		System.out.println(a+b);
		
//		3. Write a Java program to divide two numbers and print on the screen.
//		Test Data:
//		50/3
//		Expected Output : 
//		43 
//		16
//		19 
//		13

		int a1 = 50;
		int b1 = 3;
		System.out.println(a1/b1);
		
//		4. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))		
//		Expected Output
//		2.138888888888889

		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
//		5. Try to concat "Hello Selenium" with a character 't'.

		System.out.println("Hello"+"t"+"Selenium");
		
//		6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//		"Your Total amount is. 3700".
		
		int a2 = 100;
		int b2 = 200;
		int c2 = 3400;
		
		System.out.println("Your Total amount is: " + (a2+b2+c2));
		
//		7. Print the ASCII value of the character 'h'.

		System.out.println((byte)'h');
		
//		8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.

		int value = (byte)'d'+3;
		System.out.println((char)value);
		
//		9. Write a program to find the square of the number 3.9.
		
		System.out.println(3.9 * 3.9);
//		---------------------------------------------------------------------------

/////// Incremental/ Decremental Operators:
// 		1. Guess the output		
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

// 		2. Guess the output
		int a3 = 11, b3 = 22, c3;
		c3= a3 + b3 + a3++ + b3++ + ++a3 + ++b3;
//			   33 	+ 11   + 22   + 13   + 24
		System.out.println(c3);
		
//		3. What will be output ?
		int d=0;
		d = d++ - --d + ++d - d--;
//			0   - 0   + 1   - 1		
		System.out.println(d);
		
//		4. What will be o/p ? 
		int e=1, f=2, g=3;
		int h = e-- - f-- - g--;  // 1 - 2 - 3
		System.out.println("e="+e); // 0
		System.out.println("f="+f); // 1
		System.out.println("g="+g); // 2
		System.out.println("h="+h); // -4
		
//		5. What will be o/p ?
		int j=1, k=2;
		System.out.println(--k - ++j + ++k - --j); // 1 - 2 + 2 - 1
		
//		6. What will be o/p ?
		int l=19, m=29, n;
		n = l-- - l++ + --m - ++m + --l - m-- + ++l - m++;
//			19  - 18  + 28  - 29  + 18  - 29  + 19  - 28
		System.out.println("l="+l); // 19
		System.out.println("m="+m); // 29
		System.out.println("n="+n); // -20

//		7. What will be o/p ?
		int o = 0, p = 0;
		int q = --o * --p * p-- * o--;
//				-1  * -1  * -1  * -1
		System.out.println(q);
//		System.out.println(p);
//		System.out.println(o);

//		8. What will be o/p ?
		int a4=1;
		a4 = a4++ + ++a4 * --a4 - a4--;
//			 1    + 3    * 2    - 2
		System.out.println(a4);
System.out.println("----------------");
//		9. What will be o/p ?
		int ch = 'A';
		System.out.println(ch++);
		System.out.println(ch);
		System.out.println('A' + 1);
		
//		10. What will be o/p ?
		char ch1 = 'A';
		System.out.println(++ch1);
		System.out.println((int)++ch1);

//		11. What will be o/p ?
		double d1 = 1.5, D = 2.5;
		System.out.println(d1++ + ++D);
	}
}

