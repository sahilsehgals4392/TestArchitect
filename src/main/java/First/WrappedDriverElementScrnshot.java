package First;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WrappedDriverElementScrnshot  extends Testng {
	@Test
	public void imagecapture() throws IOException
	{
		driver.get("http://www.google.com");
		WebElement el=driver.findElement(By.id("hplogo"));
		File scrnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage image=ImageIO.read(scrnshot);
		Point point=el.getLocation();
		int width=el.getSize().getWidth();
		int height=el.getSize().getHeight();
		 BufferedImage elscrnshot=image.getSubimage(point.getX(),point.getY(),width,height);
		 ImageIO.write(elscrnshot,"jpg",scrnshot);
		FileUtils.copyFile(scrnshot, new File("C:\\Users\\Sahil\\Desktop\\element.jpg"));
	}
}
