package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement pop;

	@FindBy(xpath = "(//span[@class='headerIconWrapper'])[2]")
	private WebElement hotel;

	
	public WebElement getPop() {
		return pop;
	}



	public WebElement getHotel() {
		return hotel;
	}



	public WebElement getCity() {
		return city;
	}



	public WebElement getLocation() {
		return Location;
	}



	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(xpath = "(//li[@role='option'])[2]")
	private WebElement Location;
	

	
	public HomePage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}


	}
