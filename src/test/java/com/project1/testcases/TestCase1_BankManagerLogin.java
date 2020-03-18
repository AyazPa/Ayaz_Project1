package com.project1.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.project1.base.TestBase;

public class TestCase1_BankManagerLogin extends TestBase
{

	@Test
	public static void testCase1_BankManagerLogin()
	{
		driver.findElement(By.xpath(OR.getProperty("ManLoigbtn"))).click();
		log.debug("Clicked on Manager login Button");
		
		String Actual_title = driver.getTitle();
		
		try{
			Assert.assertEquals(Actual_title, OR.getProperty("Expected_title"));
			log.debug("login succesfull");
			System.out.println("login Succesfull");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.debug("login Failed");
		}
	
	}
	
}
