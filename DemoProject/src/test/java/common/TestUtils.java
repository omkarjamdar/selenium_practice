	package common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtils extends BaseTest
{
	public String getScreenshot() throws IOException
	{
		Date currentdate = new Date();
		String screenshotefilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//" + screenshotefilename + ".png"));
		
		return screenshotefilename;
	}
}
