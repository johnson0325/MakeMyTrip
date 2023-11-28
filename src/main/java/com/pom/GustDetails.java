package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GustDetails {
	public WebDriver driver;

	@FindBy(id = "fName")
	private WebElement fName;

	@FindBy(id = "lName")
	private WebElement lName;

		
	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getBookwith() {
		return bookwith;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "mNo")
	private WebElement mobile;
	
	@FindBy(xpath = "(//div[@class='makeFlex'])[5]")
	private WebElement bookwith;
	
	@FindBy(xpath = "//a[text()='LOGIN TO BOOK NOW']")
	private WebElement booknow;
	
	public GustDetails(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);

	
	}
}
