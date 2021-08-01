package First;

public class StringOnlyIntegers {

	
public static boolean isEmpty(CharSequence cs)
{
return cs==null || cs.length()==0;
}

public static boolean isNumeric(CharSequence cs)
{

	if(isEmpty(cs))
		return false;
	
	for (int i = 0; i < cs.length(); i++) {
		
		if(!Character.isDigit(cs.charAt(i)))
			return false;
	}
	
return true;
}


public static void main(String[] args) {
	System.out.println(isNumeric(null));
	System.out.println(isNumeric(""));
	System.out.println(isNumeric(" "));
	System.out.println(isNumeric("Test123"));
	System.out.println(isNumeric("123Test"));
	System.out.println(isNumeric("1234"));
	System.out.println(isNumeric("-5624"));
	System.out.println(isNumeric("0"));
}



}
