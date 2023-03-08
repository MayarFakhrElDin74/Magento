package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.AfterRegistrationPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationLogoutLoginTest extends TestBase {
	
	HomePage homeObject ;
	RegistrationPage registerObject ;
	AfterRegistrationPage afterRegisterationObject ;
	LoginPage loginObject ;
	
	Faker faker = new Faker() ;
	
	String firstname = faker.name().firstName() ;
	String lastname = faker.name().lastName() ;
	String email = faker.internet().emailAddress() ;
	String password = faker.internet().password() ;
	
	String registerationmsg = "Thank you for registering with Madison Island." ;
	String logoutmsg = "You have logged out and will be redirected to our homepage in 5 seconds." ;
	String welcomemsg = "Welcome," +firstname +lastname+ "!" ;
	
	
	@Test (priority = 1)
	
	public void userCanRegisterSuccessfully ()
	
	{
		homeObject = new HomePage(driver) ;
		homeObject.goToRegistrationPage();
		
		registerObject = new RegistrationPage(driver) ;
		registerObject.UserRegister(firstname, lastname, email, password);
		
		assertEquals(registerationmsg, "Thank you for registering with Madison Island.");
	}
	
	
@Test (priority = 2)
	

	public void registeredUserLogout ()
	
	{
		afterRegisterationObject = new AfterRegistrationPage(driver) ;
		afterRegisterationObject.registeredUserLogout();
		
		assertEquals(logoutmsg , "You have logged out and will be redirected to our homepage in 5 seconds.");
		
	}
	
	
	
	@Test (priority = 3)

	public void registeredUserLogin ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToLoginPage();

		loginObject = new LoginPage(driver) ;
		loginObject.registeredUserLogin(email , password) ;
		
		assertEquals(welcomemsg, "Welcome," +firstname +lastname+ "!");

	}


}
