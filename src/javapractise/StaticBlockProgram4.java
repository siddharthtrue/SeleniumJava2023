package javapractise;

public class StaticBlockProgram4
{
// Use of static block - it should be used as a precondition before executing the main block. 
	static
	{
		System.out.println("Hello");
	}
	
	static
	{
		System.out.println("Hello 1");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Bye");
	}
}
