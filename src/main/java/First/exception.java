package First;

public class exception {

	public static void main(String[] args) {
		int i=1;
		
		switch (i) {
		case 1:
		throw new ArithmeticException("1 is not allowed");
		case 2:
			throw new ArithmeticException("2 is not allowed");
		case 3:
			throw new ArithmeticException("3 is not allowed");
		case 4:
			throw new ArithmeticException("4 is not allowed");
						
	}
}
}
