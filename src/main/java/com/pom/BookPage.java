package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	public WebDriver driver;

	public WebElement getHotelSelect() {
		return hotelSelect;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(xpath = "(//div[@class='flexOne appendLeft20'])[1]")
	private WebElement hotelSelect;

	@FindBy(xpath = "//button[@class='primaryBtn bkng__btn  ']")
	private WebElement book;
	
	public BookPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}

	

}
