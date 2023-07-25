package com.ActiTime.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {
		@FindBy(xpath = "//div[@class='addNewButton']")
		private WebElement addnewbtn;
		
		@FindBy(xpath = "//div[.='+ New Customer']")
		private WebElement newcust;
		
		@FindBy(xpath = "(//input[@Placeholder='Enter Customer Name'])[2]")
		private WebElement custname;
		
		@FindBy(xpath = "(//textarea[@Placeholder='Enter Customer Description'])")
		private WebElement custdesp;
		
		@FindBy(xpath = "//div[.='Create Customer']")
		private WebElement creatcustbtn;
		
		@FindBy(xpath = "//DIV[@id='customerLightBox_content']/descendant::DIV[@class='greyButton cancelBtn']")
		private WebElement cancelbtn;
		
		//intailization
		public TaskPage(WebDriver driver) {
			
		}
}
		
