package Utils;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void capturescreenshot(WebDriver driver) throws IOException
	{

		Date date= new Date();
		DateFormat dt= new SimpleDateFormat("dd-mm-yyyy HH mm SS");
		String a=dt.format(date);
		//System.out.println(a);
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File path=new File("F:\\Velocity Class\\Selenium\\New folder"+a+".jpeg");
		FileHandler.copy(source, path);
	}

}
