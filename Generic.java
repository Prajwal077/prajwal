package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	WebDriver driver;
  @BeforeMethod
  public void open() {
	System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
}
 
//  @AfterMethod
//  public void quit()
//  {
//	  driver.quit();
//  }
}