package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {


	public WebDriver driver ;


	@BeforeSuite 

	@Parameters ({"browser"})

	public void startDriver (@Optional ("chrome") String browserName)

	{

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver() ;

			if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver() ;

				if (browserName.equalsIgnoreCase("ie")) {
					driver = new InternetExplorerDriver() ;
				}

			}
		}

		driver.manage().window().maximize();
		driver.navigate().to("http://magento-demo.lexiconn.com/");
	}



	@AfterSuite

	public void closeDriver ()
	
	{
		driver.quit();
	}

}

