package Demo;

public class exceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			System.out.println("The is the first print statement for this class");

			int x = 100/0;

			System.out.println(x);

			System.out.println("This is the last statement on this class");

		} catch (Exception exc) {

			System.out.println("I am inside the catch block");
			System.out.println(exc.getCause());
			System.out.println(exc.getMessage());
			System.out.println(exc.getStackTrace());
			exc.printStackTrace();

		} finally {
			
			System.out.println("The demo is over .. go home everyone");
		}
		}};
