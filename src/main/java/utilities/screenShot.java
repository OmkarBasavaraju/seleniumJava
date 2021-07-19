package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.Base;

public class screenShot extends Base {
	public static String filePath;
	
	public static void tajeScreenShot() throws IOException {
	File sFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String filePath = "C:\\Users\\IGSA937002\\eclipse-workspace\\PageObjectModelPageFactory\\target\\screenShot\\"+"error.png";
	File scrrenshotFile  = new File(filePath);
	FileUtils.copyFile(sFile, scrrenshotFile);
	}
	
	
}
