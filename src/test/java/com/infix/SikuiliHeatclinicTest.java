package com.infix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class SikuiliHeatclinicTest {
  protected WebDriver driver = null;
  protected Screen screen = null;
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.navigate().to("http:/qa1.paxotech.com/heatclinic/");
		
		Settings.setShowActions(true);
		Settings.AutoWaitTimeout = 20;
		Settings.WaitScanRate = 3;
		screen = new Screen();
		ImagePath.add(System.getProperty("user.dir")+"/images/");
		
  }
  @Test
  public void f() throws FindFailed {
//	  WebElement loginLink = driver.findElement(By.xpath("//*[@id='cart_info']//span[text() = 'Login']"));
//	  loginLink.click();
	  
//	  screen.wait("EmailTextBox_Win.png");
//	  screen.mouseMove("EmailTextBox_Win.png");
//	  screen.type("EmailTextBox_Win.png", "marufrahman1349@gmail.com");
//	  
//	  screen.wait("PasswordTextBox_Win.png");
//	  screen.mouseMove("PasswordTextBox_Win.png");
//	  screen.type("PasswordTextBox_Win.png", "maruf");
//	  
//	  screen.click("LoginButton_Win.png");
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,450)", "");
	  
	  screen.wait("AddProduct_win.png");
	  screen.mouseMove("AddProduct_win.png");
	  screen.click("AddProduct_win.png");
	  
//	  JavascriptExecutor jseUp = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,-450)", "");
	  
	  screen.wait("Cart_win.png");
	  screen.mouseMove("Cart_win.png");
	  screen.click("Cart_win.png");
	  
	  screen.wait("Chk_win.png");
	  screen.mouseMove("Chk_win.png");
	  screen.click("Chk_win.png");
	  
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
