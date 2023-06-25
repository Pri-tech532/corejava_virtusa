//okay

import java.util.*;

public class Clear_an_array {

	// Main driver method
	public static void main(String[] arg)
	{
        Scanner sc=new Scanner(System.in);

		
		ArrayList<String> array = new ArrayList<String>();

         System.out.println("Enter length of the array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter string in the array");
            String a=sc.next();
            array.add(a);
        }

	
		// Printing ArrayList
		System.out.println("Array List : " + array);

		// Display message
		System.out.println("Numbers ArrayList consists of: " + n + " elements");

		
		// Using clear function
        System.out.println("Using clear function");
		array.clear();

		int array_size_new = array.size();

		// Printing new ArrayList
		System.out.println(
			"Final Array List consists of: " + array_size_new + " elements"+ " and is"+ array);
	}
}
