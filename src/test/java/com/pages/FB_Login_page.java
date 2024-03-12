package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Reuseble;

public class FB_Login_page extends Reuseble{
	
	
	public FB_Login_page(WebDriver driver) {
			
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	


	@FindBy(id="email")
	 WebElement user_name;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement Login_Btn;
	
	
	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return Login_Btn;
	}

}
