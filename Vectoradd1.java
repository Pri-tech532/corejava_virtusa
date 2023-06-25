
import java.util.*;

public class Vectoradd1 {

// Main driver method
	public static void main(String[] args)
	{

		// Create an ArrayList
		ArrayList<String> Arr = new ArrayList<String>();

		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter an element of array");
            String a=sc.next();
            Arr.add(a);

        }

		// Display message
		System.out.print("The ArrayList is : ");

		System.out.println(Arr);

		// Creating a vector for elements
		Vector<String> vector = new Vector<String>();
        System.out.println("Enter the size of vector array");
        int g=sc.nextInt();
        for(int i=0;i<g;i++)
        {
            System.out.println("add vector element");
            String h=sc.next();
            vector.add(h);


        }

	System.out.println("enter position in array to add less than n");
        int j=sc.nextInt();
		Arr.addAll(j, vector);

		// Display arrayList after insert elements
		System.out.println(	"List after addition of element at specific index : ");

		System.out.println(Arr);
	}
}
