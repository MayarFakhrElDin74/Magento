package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.AfterRegistrationPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationLogoutLoginWithJsonTest extends TestBase {


	HomePage homeObject ;
	RegistrationPage registerObject ;
	AfterRegistrationPage afterRegisterationObject ;
	LoginPage loginObject ;


	String registerationmsg = "Thank you for registering with Madison Island." ;
	String logoutmsg = "You have logged out and will be redirected to our homepage in 5 seconds." ;
	String welcomemsg = "Welcome" ;
	
	

	@Test (priority = 1)

	public void userCanRegisterSuccessfully () throws FileNotFoundException, IOException, ParseException
	{

		JsonDataReader jsonDataReader = new JsonDataReader() ;
		jsonDataReader.jsonReader();

		homeObject = new HomePage(driver) ;
		homeObject.goToRegistrationPage();

		registerObject = new RegistrationPage(driver) ;
		registerObject.UserRegister 
		(jsonDataReader.firstname , jsonDataReader.lastname , jsonDataReader.email , jsonDataReader.password ) ;
		
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

	public void registeredUserLogin () throws FileNotFoundException, IOException, ParseException

	{
		
		homeObject = new HomePage(driver) ;
		homeObject.goToLoginPage();

		JsonDataReader jsonDataReader = new JsonDataReader() ;
		jsonDataReader.jsonReader();
		
		loginObject = new LoginPage(driver) ;
		loginObject.registeredUserLogin(jsonDataReader.email , jsonDataReader.password) ;
		
		assertTrue(welcomemsg.contains("Welcome")) ;

	}



}
