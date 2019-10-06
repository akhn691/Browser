package com.sk.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomePage {

	@Test//author is unknown
	public void launchAppleBrowser() {
		System.out.println("Launching website");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.apple.com");

	}

	@Test
	public void launchGoogleBrowser() {
		System.out.println("Launching website");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

	@Test
	public void launchBingBrowser() {
		System.out.println("Launching website");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
	}

	@Test
	public void launchYoutubeBrowser() {
		System.out.println("Launching website");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com");
	}

}
