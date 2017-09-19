package com.selenium.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class gridIE {

	
	 WebDriver driver;
		String BaseURl="https://www.google.com";
		String NodeUrl="http://192.168.0.111:4444/wd/hub";
		
		@Test
		public void gridchrome() throws MalformedURLException
		{
			
			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			capability.setPlatform(Platform.WINDOWS);
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			capability.setBrowserName("internet explorer");
			driver = new RemoteWebDriver(new URL(NodeUrl),capability);
			driver.get(BaseURl);
			driver.manage().window().maximize();
			
		}
		
		@AfterClass
		public void tearDown() {
			if(driver!=null) {
				System.out.println("Closing IE browser");
				driver.quit();
			}
		}
}
