package auto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Contactus extends Generic {
	@Test
	public void contact() throws InterruptedException {
		driver.findElement(By.linkText("Support")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("prajwal");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prajwaln2016@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8549067748");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("my order is apple phone plzz order this phone as soon as soon ");
		driver.findElement(By.xpath("//input[@value='Send']")).click();
		
		Thread.sleep(2000);
	}

}
