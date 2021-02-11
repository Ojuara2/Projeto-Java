package projetpablo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {
	
	private static WebDriver driver;
	
	@Before
	public void acessForm() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");			
		
	}

	
	@After
	public void tearDown() throws Exception {
    driver.quit();		
		
	}
	
	public static WebDriver getDriver() {
	return driver;	
	}
	
	
}
