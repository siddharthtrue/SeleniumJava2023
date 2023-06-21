package javapractise;

public class IncrDecrmntOperators3
{
	public static void main(String[] args)
	{
		int p = -98;
		int q = p++;
		System.out.println(p);
		System.out.println(q);
		
		int a = -98;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		int pop = 2;
		System.out.println(pop++);
		System.out.println(pop);
		
		int pop1 = 2;
		System.out.println(++pop1);
		System.out.println(pop1);
		
		int amt = 10;
		int finalamt = amt + 1;
		System.out.println(finalamt);
		
		int na = 1;
		int test = na++ + na++ + na++ + na++; //1 + 2 + 3 + 4
		System.out.println(test);
		System.out.println(na);
	}
}
