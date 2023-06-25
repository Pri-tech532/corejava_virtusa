
//okay
import java.util.*;
public class Bin_s_o_arraylist {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		int n=sc.nextInt();
        for(int i=0;i<n;++i){
            System.out.println("Enter an element to the array");
            int a=sc.nextInt();
            arr.add(a);
        }
		// Initializing the key to be found.
        System.out.println("Enter the value to find");
		int v = sc.nextInt();
	
		// Printing elements of array list
		System.out.println("The elements of the arraylist are: "+arr);
	
		// Implementing the built-in binarySearch method from collections
		int result = Collections.binarySearch(arr,v);
	
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("The Element " + v + " is found at "
							+ "index " + result);
	}
}
