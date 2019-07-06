import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AutoITFileUpload {
@Test
public void fileUpload() {
	System.out.println("QA jenkins "+System.getProperty("environment"));
	/*System.getProperty("Webdriver.chrome.driver", "C:\\Users\\bhoomi\\workspace\\AutoItArt\\chromedriver.exe");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("something", true);
	
	WebDriver dr=new ChromeDriver(capabilities);
	dr.manage().window().maximize();
	dr.get("file:///C:/Users/bhoomi/Desktop/upload/fileupload.html");
	dr.findElement(By.xpath("//*[@id='1']")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\bhoomi\\Desktop\\upload\\upload.exe");
	*/
}

}
