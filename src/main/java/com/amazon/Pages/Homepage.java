package com.amazon.Pages;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.Basepage;

public class Homepage extends Basepage {

	//pagefactory
	
@FindBy(linkText="Best Sellers")

WebElement BestSellers;	

@FindBy(xpath="//*[@tabindex='54']")
WebElement NewReleases;

@FindBy(tagName="a")
WebElement GiftCards;


       //intialization pagefactory

public void Homepage() {
	PageFactory.initElements(driver,this);	
	
}

        //Actions
public String verifyHomepageTitle() {
	return driver.getTitle();
}


public Bestsellers clickonBestSellersLink() throws Exception {
	Thread.sleep(10000);
	BestSellers.click();
	return new Bestsellers();

}

public NewRelease clickonNewReleases() {
	NewReleases.click();
	return new NewRelease();
}



	
public Giftcards clickonGiftCards() {
	
	 GiftCards.click();
	 return new Giftcards();
}

		
	

}
