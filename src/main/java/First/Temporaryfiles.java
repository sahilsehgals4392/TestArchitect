package First;

import org.openqa.selenium.io.TemporaryFilesystem;

import java.io.File;
import java.io.IOException;

public class Temporaryfiles {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f=TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix", "suffix");
		System.out.println(f.getAbsolutePath());
		System.out.println();
		Thread.sleep(5000);
		TemporaryFilesystem.getDefaultTmpFS().deleteTempDir(f);
		File f1=TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix1", "suffix1");
		System.out.println(f1.getAbsolutePath());
		System.out.println();
		File f2=TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix2", "suffix2");
		System.out.println();
		System.out.println(f2.getAbsolutePath());
		TemporaryFilesystem t=TemporaryFilesystem.getDefaultTmpFS();
		Thread.sleep(1000);
		TemporaryFilesystem.getDefaultTmpFS().deleteTemporaryFiles();
		
		TemporaryFilesystem tf=TemporaryFilesystem.getTmpFsBasedOn(new File("C:\\Selenium\\Temporary Files"));
		File f4=tf.createTempDir("prefix", "suffix");
		System.out.println();
		System.out.println(f4.getAbsolutePath());
		Thread.sleep(5000);
		
		
	}

}
