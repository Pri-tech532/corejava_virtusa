import java.lang.Thread;

class Sleeping_main_thread {
	public static void main(String[] args)
	{
		
	
		try {
			for (int i = 0; i < 5; i++) {
			
			
				Thread.sleep(1000);
			
				// printing the value of the variable
				System.out.println(i);
			}
		}
		catch (Exception e) {
		
			// catching the exception
			System.out.println(e);
		}
	}
}
