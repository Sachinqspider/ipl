package com.FaceBok.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class faceBook {
      @Test
	public void createfacebook() throws InterruptedException {
Reporter.log("facebook",true);
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//a[text()='Create new account']")).click(); Thread.sleep(5000);
     driver.findElement(By.name("firstname")).sendKeys("Sagar");Thread.sleep(5000);
     driver.findElement(By.name("lastname")).sendKeys("madapur");
     driver.findElement(By.name("reg_email__")).sendKeys("984345678");Thread.sleep(5000);
     driver.findElement(By.name("reg_passwd__")).sendKeys("sagar@413");
     WebElement day = driver.findElement(By.name("birthday_day"));Thread.sleep(5000);
     Select d = new Select(day);
     d.selectByValue("7");
     WebElement month = driver.findElement(By.name("birthday_month"));
     Select m = new Select(month);Thread.sleep(5000);
     m.selectByVisibleText("Jan");
    WebElement year = driver.findElement(By.name("birthday_year"));Thread.sleep(5000);
    Select y = new Select(year);Thread.sleep(5000);
    y.selectByValue("1997"); Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@value='2']")).click();Thread.sleep(5000);
     driver.findElement(By.name("websubmit")).click();Thread.sleep(5000);
     
     driver.quit();
    
	}

}
