package com.amazon.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Base.Basepage;
import com.amazon.Pages.Homepage;
import com.amazon.Pages.Loginpage;


public class LoginpageTest extends Basepage {
	Loginpage loginpage;
	Homepage homepage;
	public LoginpageTest(){
	   super();
	
	}
		
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new Loginpage();
		
	}
		@Test(priority=1)
	public void LoginPageTitle() {
		String s =loginpage.validateLoginPageTitle();
		AssertJUnit.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", s);
		}
		
		@Test(priority=2)
		public void LoginpageLogo() {
			boolean logo=loginpage.ValidateLogo();
			AssertJUnit.assertTrue(logo);
			
		}
		
		    @Test(priority=3)
		public void sign() throws Exception{
        	loginpage.mouse();
         	homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
        @Test(priority=4)
        public void Links() throws Exception {
        	loginpage.AllLinks();
        }
        
       
        
        
        
	
	
	@AfterMethod
	public void tearDown () {
		
		//driver.quit();
		
	}
	
	
	
	
	
	
	
	

}
