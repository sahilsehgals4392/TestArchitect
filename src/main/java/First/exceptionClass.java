package First;

public class exceptionClass {

	public static void main(String args[]) {
		try {
			int arr[] = new int[7];
			arr[7] = 25 / 0;
			System.out.println("Last Statement of try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit");
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		} catch (Exception e) {
			System.out.println("Some Other Exception");
		}

		finally {
			System.out.println("In finally block");
		}
		System.out.println("Out of the try-catch block");

	}
}
