package com.poma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pom.BookPage;
import com.pom.GustDetails;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.SearchPage;

public class PageObject extends BaseClass {
	
	private HomePage hp;
	
	private SearchPage sp;
	
	private GustDetails gd;
	
	private BookPage bp;
	
	private LoginPage lp;
	
	

	public HomePage getHomePage() {
		if (hp == null) {
			hp = new HomePage(driver);
			
		}
		return hp;
	}
	
	public SearchPage getSearchPage() {
		if (sp == null) {
			sp = new SearchPage(driver);
			
		}
		return sp;
	}
	public GustDetails getGustDetails() {
		if (gd == null) {
			gd = new GustDetails(driver);
			
		}
		return gd;
	}
	
	public BookPage getBookPage() {
		if (bp == null) {
			bp = new BookPage(driver);
			
		}
		return bp;
		
	}
	public LoginPage getLoginPage(){
		if (lp == null) {
			lp = new LoginPage(driver);
			
		}
		return lp;
	}
	
}
