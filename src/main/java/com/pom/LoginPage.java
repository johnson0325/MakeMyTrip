package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getCon() {
		return con;
	}

	@FindBy(xpath = "//button[@data-cy='continueBtn']")
	private WebElement con;

	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);

	}
}
