package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DemoQA;

public class DemoTest2 {
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
		public void titleVerify() {
			String actual=driver.getTitle();
			System.out.println(actual);
			String expected="DEMOQA";
			Assert.assertEquals(actual, expected);
		}
		
		@Test(priority = 2)
		public void clickForm() {
			dm.clcikForms();
		}
		
		@Test(priority = 3)
		public void clickPracticeForm() {
			dm.clcikpracticeform();
		}

		@AfterTest
		public void afterTest() {
			driver.close();
		}
}
