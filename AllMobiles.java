package auto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AllMobiles extends Generic{
	@Test
	public void Allmobile() throws InterruptedException
	{
	driver.findElement(By.linkText("All Mobiles")).click();	
	driver.findElement(By.xpath("//input[@placeholder='Search your Mobile name here']")).sendKeys("Samsung Galaxy S21");
	driver.findElement(By.linkText("Order")).click();
	Thread.sleep(2000);
	Set<String>window=driver.getWindowHandles();//For WindowHandling
	Iterator<String>it=window.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[1]/input")).sendKeys("prajwal");//FirstName TextField
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[2]/input")).sendKeys("N");//LastName TextField
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div[1]/input")).sendKeys("prajwaln2016@gmail.com");//GmailText Field
	driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Prajwal123");//PassWord TextField
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/input")).click();//GenderRadio Button(Male)
	driver.findElement(By.xpath("//input[@placeholder='00000000000']")).sendKeys("8549067748");//PhoneNumber TextField
	driver.findElement(By.xpath("//input[@id=' address1']")).sendKeys("Qulitest MAnyata tech park");//Address1 TextField
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Bengaluru");//Address TextField
	driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("BENGALURU");//CityText field
	WebElement staticDropdown=driver.findElement(By.id("inputState"));//State DropDown Button
	Select dropdown=new Select(staticDropdown);// ForHandling DropDown
	dropdown.selectByIndex(1);
	dropdown.selectByIndex(2);
	driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("562132");//ZipDrop Down
	driver.findElement(By.xpath("//input[@rel='samsung']")).click();//SamSung RadioButton
	driver.findElement(By.xpath("//input[@rel='apple']")).click();//Apple RadioButton
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/fieldset/div/div[3]/div/div[3]/select/option[2]")).click();
	driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");//Number Of Times TextField
	driver.findElement(By.xpath("//input[@name='time']")).sendKeys("1");
	driver.findElement(By.id("gridCheck1")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[9]/div[2]/input")).click();
	driver.findElement(By.xpath("//button[@data-toggle='modal']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Close']")).click();
	
}
}
	
	

