package test;

import org.testng.annotations.Test;

import pages.DemoQA;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoTest1 {
 WebDriver driver;
 DemoQA dm;
	@BeforeTest
	public void beforeTest() {
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		dm=new DemoQA(driver);
		
	}

	@Test(priority = 1)
	public void test1() {
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="DEMOQA";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 2)
	public void test2() {
		dm.clcikForms();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
