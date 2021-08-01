package First;

import org.openqa.selenium.io.Zip;

import java.io.FileNotFoundException;
import java.io.IOException;

public class zipfile {

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException {
	
		Zip ta=new Zip();
		System.out.println("Start");
//		ta.zip(new File("C:\\New Folder\\Temporary Files"),new File("C:\\New Folder\\Temporary Files.zip"));
//		Thread.sleep(5000);
//		System.out.println("Done");
//		System.out.println("Unzip");
//		ta.unzip(new File("C:\\New Folder\\Temporary Files1.zip"),new File("C:\\New Folder\\"));
		System.out.println("Unzip Done");
	}
}
