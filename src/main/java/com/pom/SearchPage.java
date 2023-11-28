package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver;

	@FindBy(xpath = "//div[@aria-label='Fri Dec 22 2023']")
	private WebElement datein;

	@FindBy(xpath = "//div[@aria-label='Sun Dec 31 2023']")
	private WebElement dateout;

		
	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;
	
	@FindBy(id = "hsw_search_button")
	private WebElement search;
	

	
	public WebElement getDatein() {
		return datein;
	}



	public WebElement getDateout() {
		return dateout;
	}



	public WebElement getApply() {
		return apply;
	}



	public WebElement getSearch() {
		return search;
	}



	public SearchPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}



}
