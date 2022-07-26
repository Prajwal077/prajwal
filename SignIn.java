package auto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignIn extends Generic{
@Test
public void Signup() throws InterruptedException {
 driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();//sign in button
 Thread.sleep(3000);
 driver.findElement(By.linkText("Sign up")).click();//Sign up button
 driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Prajwal");//FirstName TextField
 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("N");//LastName TextField
 driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("prajwaln2016@gmail.com");//Enter GmailTextField
 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("prajwal123");//PassWord TextField
 driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20-07-1999");//DateOfBirth 
 driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();//Gender RadioButton
 driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8549067748");//Phone Number TextField
 driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("I want order the phone then order the phone ");//ShortBio TextArea Field
 driver.findElement(By.xpath("//button[@type='submit']")).click();//
 Thread.sleep(2000);
 driver.switchTo().alert().accept();
 driver.findElement(By.xpath("//button[@type='Submit']")).click();
 driver.switchTo().alert().accept();
 Thread.sleep(2000);



}}
