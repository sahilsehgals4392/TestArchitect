package Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class arrayAscending {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	int i,j;
	
	int arr[]=new int[10];
	
	InputStreamReader ins = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ins);
	
	for (int k = 0; k < arr.length; k++) {
		String s=br.readLine();
		arr[k]=Integer.parseInt(s);
	}
	System.out.println(Arrays.toString(arr));
	
	for (int k = 0; k < arr.length-1; k++) {
		for (int k2 = 0; k2 < arr.length-1-k; k2++) {
			
			if(arr[k2]>arr[k2+1])
			{
				int c=arr[k2];
				arr[k2]=arr[k2+1];
				arr[k2+1]=c;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	System.out.println(Arrays.toString(arr));
	
}
}
