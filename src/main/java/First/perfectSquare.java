package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class perfectSquare {

	public static void main(String[] args) throws IOException {
		
		double f;
		InputStreamReader ins=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ins);
	
	String s=br.readLine();
	f=Double.parseDouble(s);
	
	double a=Math.sqrt(f);
	double b=Math.ceil(a);
	if(b-a==0)
	{
		System.out.println("Square Perfect");
	}
	else
	{
		System.out.println("Square Imperfect");
	}
	
	
	}
}
