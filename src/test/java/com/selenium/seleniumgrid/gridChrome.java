package com.selenium.seleniumgrid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gridChrome {
   
	WebDriver driver;
	String BaseURl="http://www.google.com";
	String NodeUrl="http://192.168.0.111:4444/wd/hub";
	
	@Test
	public void gridchrome() throws MalformedURLException
	{
		WebDriver driver;
		String BaseURl="http://www.google.com";
		String NodeUrl="http://192.168.0.111:4444/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setPlatform(Platform.WINDOWS);
		capability.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL(NodeUrl),capability);
		driver.get(BaseURl);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing chrome browser");
			driver.quit();
		}
	}
}
