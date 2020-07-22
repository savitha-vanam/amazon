package com.amazon.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.Basepage;

public class Loginpage extends Basepage{
	
	
	
	//pagefactory

@FindBy(tagName="span")
WebElement Logo;
	
@FindBy(xpath=" //div[@class='a-row a-spacing-base']//input[@id='ap_email']")	
	//@FindBy(xpath=".//*[@type='email']")
WebElement Email;
	
@FindBy(xpath="//input[@aria-labelledby]")
WebElement Continue;

@FindBy(xpath=".//*[@id='ap_password']")
WebElement Password;

@FindBy(xpath=".//*[@id='signInSubmit']")
WebElement SigninBtn;



//Initializing the Page Objects:
	public Loginpage(){
		PageFactory.initElements(driver, this);
		
	}	

                  //Actions
	
	public String validateLoginPageTitle() //Title page verify
    {
    	return driver.getTitle();
    }
	
	public boolean ValidateLogo() {
   	 return Logo.isDisplayed();	
		
	}

	
   public void mouse() throws Exception {    //Mousehover action
	   
	   Actions act=new Actions(driver);
		WebElement ele =driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
		
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		
		
		WebElement ele1=driver.findElement(By.xpath(".//a[@rel]/span"));
		
		act.moveToElement(ele1).click().build().perform();
		
		

   }
 
  public Homepage login(String un,String pwd) throws Exception{   //loginpage credentials
	  Thread.sleep(10000);
	   Email.sendKeys(un);
		Continue.click();
		 Password.sendKeys( pwd);
		 SigninBtn.click();	
		 Thread.sleep(10000);
		return new Homepage();
	}
  
  public void AllLinks() throws Exception {    //For all Links
	 
List<WebElement>links=driver.findElements(By.tagName("span"));

	  System.out.println("no of links:"+links.size());
	  for(int i=0;i<links.size();i++) {
		  if(!(links.get(i).getText().isEmpty()))
		  {
			  
			  Thread.sleep(3000);
			  links.get(i).click();
			  
			 
			  driver.navigate().back();
			  Thread.sleep(3000);
			  links=driver.findElements(By.tagName("a"));
				  
	  		  } 
	               }	 
            } 
  
         
     
	
      }

