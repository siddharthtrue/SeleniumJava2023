package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrAndArrListAssnmnts9
{
	public static void main(String[] args)
	{
// 1: WAP to delete a specific number from the given array.
// int p[] = {1,4,5,2,3,22,31, 2}; 
// --Need to remove 22 from the p[] array.
// --output should be: [1, 4, 5, 2, 3, 31, 2]
		
//		int p[] = {1, 4, 5, 2, 3, 22, 31, 2};
//		System.out.println("Array values before remove: " + Arrays.toString(p));
//		int delete_Ele = 22;
//		
//		for(int i = 0; i < p.length; i++)
//		{
//			if(p[i] == delete_Ele)
//			{
//				for(int j = i; j < p.length-1; j++)
//				{
//					p[j] = p[j+1];
//				}
//				break;
//			}
//		}
//		for(int k = 0; k < p.length-1; k++)
//		{
//			System.out.println(p[k]+" ");
//			System.out.println("Array values after remove: " + Arrays.toString(p));
//		}
// In above example, last element in array is repeated because static array size will be fixed even if we 
// delete a particular element from this array.
// Check below example by using a dynamic array ---

		int p[] = {1, 4, 5, 2, 3, 22, 31, 2};
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 2, 3, 22, 31, 2));
		System.out.println("Array values before remove: " + nums);
		nums.remove(5);
		System.out.println("Array values after remove: " + nums);
		
// 2. Write a program to create a static Array, having following cricket data:
// --name, age, team name, DOB, gender, Strike Rate
// --Try to create multiple Object Arrays for different players 
// --Try to print all the values of each player on the console
		
		System.out.println("========================");
		Object cricInfo[] = new Object[6];
		cricInfo[0] = "Sachin";
		cricInfo[1] = "48";
		cricInfo[2] = "Team India";
		cricInfo[3] = "10-10-1970";
		cricInfo[4] = "Male";
		cricInfo[5] = "97.23";
		
		Object cricInfo1[] = {"Virat", "38", "Team India", "01-01-1985", "Male", "90"};
		
		System.out.println(Arrays.toString(cricInfo));
		System.out.println("========================");
		System.out.println(Arrays.toString(cricInfo1));
		
// 3. Write a Java program to create a new array list,
// --add some colors (string) 
// ---and print out the colorslist.
		
		System.out.println("========================");
		ArrayList<String> colorslist = new ArrayList<String>(Arrays.asList("Red", "Yellow", "Blue", "Green"));
		System.out.println(colorslist);
		
		System.out.println("============OR============");
		ArrayList<String> colorslist1 = new ArrayList<String>();
		colorslist1.add("Purple");
		colorslist1.add("Green");
		colorslist1.add("Pink");
		System.out.println(colorslist1);
		
		System.out.println("============OR============");
		List<String> colorslist2 = Arrays.asList("Black", "Orange", "White");
		System.out.println(colorslist2);
		
// 4. Write a Java program to retrieve an element at a specified index from a given array list.
		
		System.out.println("==========================");
// Static array - int p[] = {1, 4, 5, 2, 3, 22, 31, 2};
		System.out.println(p[3]);
// Dynamic array - ArrayList<String> colorslist1 = new ArrayList<String>();
		System.out.println(colorslist1.get(2));
		
// 5. Write a Java program to update specific array element by given element.
		
		System.out.println("==========================");
		ArrayList<Integer> scores = new ArrayList<Integer>(Arrays.asList(11, 22, 34, 44, 55));
		System.out.println("Original array: " + scores);
		scores.set(2, 33);
		System.out.println("Updated array: " + scores);
		
// 6. Write a Java program to remove the third element from an array list.
		
		System.out.println("==========================");
//		ArrayList<Integer> scores = new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55));
		scores.remove(3);
		System.out.println("Updated array after 3rd element removed: " + scores);
		
// 7. Write a Java program to search an element in an array list using for loop.
//		Once we find that element, break the loop.
		
		System.out.println("==========================");
		ArrayList<String> names = new ArrayList<String> (Arrays.asList("Amar", "Akbar", "Anthony", "Gabbar"));

		for(int i = 0; i < names.size(); i++)
		{
			if(names.get(i) == "Gabbar")
//			if(names.contains("Gabbar"))
			{
				System.out.println(names.get(i) + " found");
				break;
			}
		}
		
		System.out.println("====================================");
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		for(int i = 0; i < numbers.size(); i++)
		{
			if(numbers.get(i) == 40)
			{
				System.out.println(numbers.get(i) + " found");
				break;
			}
		}
		
// 8. Reverse this array List:
// ArrayList<String> studentNames = new ArrayList<String>();
// studentNames.add("Varun");
// studentNames.add("Reena");
// studentNames.add("Naveen");
// studentNames.add("Robin");
// studentNames.add("Peter");
		
		System.out.println("====================================");
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		System.out.println("Original Arraylist: " + studentNames.toString());
		Collections.reverse(studentNames);
		System.out.println("Reversed Arraylist: " + studentNames.toString());
		
// 9. Write a Java program to extract a portion of an array list.
		
		System.out.println("====================================");
//		ArrayList<String> colorslist = new ArrayList<String>(Arrays.asList("Red", "Yellow", "Blue", "Green"));
		System.out.println("Original Arraylist: " + colorslist.toString());
		List<String> li = colorslist.subList(0, 2);
		System.out.println("Extracted portion: " + li.toString());
		
// 10. Write a Java program to empty an array list.
		
		System.out.println("====================================");
		System.out.println("Original Arraylist: " + studentNames.toString());
		studentNames.removeAll(studentNames);
		System.out.println("Empty Arraylist: " + studentNames.toString());
		
// 11. Write a Java program to trim the virtual capacity of an array list to the current list size.
		
		System.out.println("====================================");
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
        
// 12. Write a Java program to print all the elements of an ArrayList using the position of the elements
		
     	System.out.println("====================================");
//     	for(int j = 0; j < c1.size(); j++)
//     	{
//     		System.out.println(c1.get(j));
//     	}
// Below is advanced for loop.
     	for(String e : c1)
     	{
     		System.out.println(e);
     	}
	}
}
