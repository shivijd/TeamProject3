package com.capgemini.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[1]")
	WebElement im;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean checkImage()
	{
		return im.isDisplayed();
	}  

}
