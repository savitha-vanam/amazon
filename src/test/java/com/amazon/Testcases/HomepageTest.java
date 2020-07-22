package com.amazon.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Base.Basepage;
import com.amazon.Pages.Giftcards;
import com.amazon.Pages.Homepage;
import com.amazon.Pages.Loginpage;
import com.amazon.Pages.NewRelease;

public class HomepageTest extends Basepage {
            Homepage homepage;
            Loginpage loginpage;
            
	
	
		public HomepageTest() {
			super();
			
			}
		
		
		@BeforeMethod
		public void setup() throws Exception {
		   initialization();
		   loginpage=new Loginpage();
		   loginpage.mouse();
		  homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
			
		}
		
	   @Test(priority=1)
		public void verifyHomepageTitleTest() {
			String homepagetitle=homepage.verifyHomepageTitle();
			Assert.assertEquals(homepagetitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more","Homepage title not matched");
		
		}
//		@Test(priority=2)
//		
//		public void BestSellersTest() throws Exception {
//			
//			homepage.clickonBestSellersLink();
//			}
//		
//		@Test(priority=3)
//		public void NewReleaseTest() {
//			homepage.clickonNewReleases();
//			}
//		
//		@Test(priority=4)
//		public void GiftcardsTest() {
//			homepage.clickonGiftCards();
//			
//		}
//		
//	
//		
//		
	    @AfterMethod
		public void teardown() {
			//driver.quit();
		}
            }

