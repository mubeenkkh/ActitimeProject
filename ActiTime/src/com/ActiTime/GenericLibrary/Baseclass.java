package com.ActiTime.GenericLibrary;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class Baseclass {
	public static WebDriver driver ;
		@BeforeSuite
		public void dataBaseConnection() {
		Reporter.log("Database connented succesfully",true);
		}
		@BeforeTest //or @BeforeClass
		public void lunchBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demo.actitime.com");
			Reporter.log("Browser is lunched succefully",true);
		}
		@BeforeMethod
		public void login() {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Reporter.log("logging successfully",true);
		}
		@AfterMethod
		public void logout() {
			driver.findElement(By.id("logoutLink")).click();
			Reporter.log("logout sucessfully",true);
		}
		@AfterTest  //or @AfterClass
		public void closebrowser() {
			driver.quit();
			Reporter.log("Browser is closed",true);
		}
		@AfterSuite
		public void databasedisconnection() {
			Reporter.log("Database disconnect",true);
		}
}