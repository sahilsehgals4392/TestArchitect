package First;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class integerExtract {

	public static void main(String args[])
	
	{
		String s="We need to extract 1234 integer from this string 12345";
		Pattern pattern = Pattern.compile("\\w+([0-9]+)\\w+([0-9]+)");
		Matcher matcher = pattern.matcher(s);
		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher(s);
		if(m.find())
		{
		    System.out.println(m.group(1));
		}
		/*for(int i = 0 ; i < matcher.groupCount()-1; i++) {
		  matcher.find();
		  System.out.println(matcher.group());
		}
		*/
	}
}
