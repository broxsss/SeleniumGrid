package com.selenium.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class gridfirefox {
	
	 WebDriver driver;
		String BaseURl="https://www.google.com";
		String NodeUrl="http://localhost:4444/wd/hub";
		
		@Test
		public void gridchrome() throws MalformedURLException
		{
			//System.setProperty("webdriver.chrome.driver", System.getProperty("uer.dir")+"\\resources\\chromedriver.exe");
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			capability.setPlatform(Platform.WINDOWS);
			capability.setBrowserName("firefox");
			driver = new RemoteWebDriver(new URL(NodeUrl),capability);
			driver.get(BaseURl);
			driver.manage().window().maximize();
			
		}
		
		@AfterClass
		public void tearDown() {
			if(driver!=null) {
				System.out.println("Closing firefox browser");
				driver.quit();
			}
		}
}
