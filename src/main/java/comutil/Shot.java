package comutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Shot {
	WebDriver driver ;
	public Shot(WebDriver driver){
		this.driver = driver;
	}
	public void takeshot(WebDriver driver,String testname) throws IOException {
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\screenshot\\"+testname+".png");
		
		FileUtils.copyFile(f, destination);
	}

}
