package First;

public class intreverse {
	
public static void main(String[] args) {
	
	int a=546789;
	int rev=0;
	
	while(a!=0) {
		rev=rev*10+a%10;
		a/=10;
	}
System.out.println(rev);
	
}
}
