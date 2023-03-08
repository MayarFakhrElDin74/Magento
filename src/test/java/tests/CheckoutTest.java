package tests;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.AddToCartPage;
import pages.AllAccessoriesPage;
import pages.CheckoutPage;
import pages.EyeWearResultsPage;
import pages.HomePage;
import pages.LoginCheckoutPage;
import pages.PostPlacingOrderPage;

public class CheckoutTest extends TestBase {
	
	HomePage homeObject ;
	AllAccessoriesPage allaccessoriesObject ;
	EyeWearResultsPage eyewearresultsObject ;
	AddToCartPage addtocartObject ;
	LoginCheckoutPage logincheckoutObject ;
	CheckoutPage checkoutObject ;
	PostPlacingOrderPage postplacingorderObject ;
	
	String purchasenotification = "THANK YOU FOR YOUR PURCHASE!" ;
	
	
	@Test (priority = 1)
	
	
		public void productCheckout () throws FileNotFoundException, IOException, ParseException
		
		{
			
			homeObject = new HomePage (driver) ;
			homeObject.goToAllAccessoriesPage();
			
			allaccessoriesObject = new AllAccessoriesPage(driver) ;
			allaccessoriesObject.goToEyeWearPage();
			
			eyewearresultsObject = new EyeWearResultsPage(driver) ;
			eyewearresultsObject.goToAddToCartPage();
			
			JsonDataReader jsonDataReader = new JsonDataReader() ;
			jsonDataReader.jsonReader();
			
			addtocartObject = new AddToCartPage(driver) ;
			addtocartObject.increaseProductQuantity(jsonDataReader.productquantity);
			addtocartObject.proceedToCheckout();
			
			logincheckoutObject = new LoginCheckoutPage(driver) ;
			logincheckoutObject.loginToCheckout(jsonDataReader.email , jsonDataReader.password);
						
			checkoutObject = new CheckoutPage(driver) ;
			checkoutObject.fillCheckoutInfo
			(jsonDataReader.adress, jsonDataReader.city , jsonDataReader.state , jsonDataReader.zip , jsonDataReader.country , jsonDataReader.telephone) ;
		
			assertEquals(purchasenotification, "THANK YOU FOR YOUR PURCHASE!");
			
			postplacingorderObject = new PostPlacingOrderPage(driver) ;
			postplacingorderObject.returnToHomePage();
			
	}

}
