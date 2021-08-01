package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaExample {
	
	public static void main(String[] args) {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		char ch;
		String s;
		
		try {
			System.out.println("Enter the character ");
			s=br.readLine();
			ch=(char) br.read();
			System.out.println(s);
			System.out.println(ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
