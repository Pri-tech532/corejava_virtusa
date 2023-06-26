class Base {

	// Constructor for class Base
	public Base()
	{
		System.out.println("Core");
	}
}

// Child Class inherit the Base
// Class
class NEW extends Base {

	// Constructor for class NEW
	public NEW() { System.out.println("Java"); }
}

// Main Class
public class Constructor_inheritance {

	public static void main(String[] args)
	{
		// Creating obj for
		// class NEW
		NEW obj = new NEW();
	}
}
