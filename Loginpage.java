package auto;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginpage extends Generic{
@Test(dataProvider="getdata")

public void log(String Username,String Password) throws InterruptedException {
	driver.findElement(By.xpath("//button[.='SIGN IN']")).click();//SignIn Button
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);//UserName TextField
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);//Password TextField
	driver.findElement(By.xpath("//label[@for='remember-me']")).click();//RememberMe RadioButton
	driver.findElement(By.linkText("Log In")).click();//Login Button
	Thread.sleep(2000);
}

@DataProvider

	public Object[] getdata() {
		Object[][] data=new Object[3][2];
		data[0][0]="prajwaln2016@gmail.com";
		data[0][1]="praj123";
		data[1][0]="praj123@gmail.com";
		data[1][1]="prajwal123";
		data[2][0]="prajwaln2016@gmail.com";
		data[2][1]="prajwal123";
		return data;
	}
  
}
