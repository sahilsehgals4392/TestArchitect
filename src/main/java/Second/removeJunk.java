package Second;

public class removeJunk {

	public static void main(String[] args) {
	
		String s="#@$@#$#@ Reg exp $$%#$@$";
		s=s.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(s);
	System.out.println("\"  \"");
	}
}
