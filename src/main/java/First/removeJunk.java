package First;

public class removeJunk {
	public static void main(String[] args) {
		
		String regex="#%#%# Hi There, #$##% How are You 169#$#%#";
		System.out.println(regex.replaceAll("[^a-zA-Z\\s0-9]",""));
	}
}
