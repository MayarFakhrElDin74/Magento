package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.HomePage;

public class ChangeLanguageTest extends TestBase {

	
	HomePage homeObject ;
	
	String yourlanguagefrench = "VOTRE LANGUE:" ;
	String yourlanguageenglish = "YOUR LANGUAGE:" ;
	
	
	@Test (priority = 1)
	public void changeLanguage ()
	
	{
		homeObject = new HomePage(driver) ;
		homeObject.changeLanguageToFrench();
		assertTrue(yourlanguagefrench.equals("VOTRE LANGUE:"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)) ;
		
		homeObject.returnLanguageToEnglish();
		assertTrue(yourlanguageenglish.equals("YOUR LANGUAGE:"));
		
	}
	
}
