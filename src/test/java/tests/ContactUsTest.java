package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {


HomePage homeObject ;
ContactUsPage contactUsObject ;


	Faker faker = new Faker() ;

	String username = faker.name().username() ;
	String email = faker.internet().emailAddress() ;
	
	String comment = "Hi!" ;
	String contactussuccessmsg = "Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us." ;

	

	@Test (priority = 1)

	public void contactUs ()
	
	{
		
		homeObject = new HomePage(driver) ;
		homeObject.goToContactUsPage();
		
		contactUsObject = new ContactUsPage(driver) ;
		contactUsObject.contactUs(username, email, comment);
		
		assertEquals(contactussuccessmsg, "Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.") ;
		
	}
}
