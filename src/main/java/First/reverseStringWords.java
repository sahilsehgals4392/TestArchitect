package First;

public class reverseStringWords {
	
	public static void main(String[] args) {
		
		String text="This is a string text";
		String words[]=text.split(" ");
		
	String finalString="";
	String reverseword;
	String reverseString="";
	
	for (int i = 0; i < words.length; i++) {
		reverseword="";
		
		for (int j = words[i].length()-1; j >=0 ; j--) {
			reverseword=reverseword+words[i].charAt(j);
		}
		reverseString=reverseString+reverseword+" ";
		finalString=reverseString;
	}
		System.out.println(finalString);
		String a,b="";
		for (int i = 0; i < words.length; i++)
		{	StringBuffer sb=new StringBuffer(words[i]);
			a=sb.reverse().toString();
			b=b+a+" ";
		}
		System.out.println(b);
	}


}
