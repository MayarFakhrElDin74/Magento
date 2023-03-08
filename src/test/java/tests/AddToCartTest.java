package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.AddToCartPage;
import pages.AllAccessoriesPage;
import pages.EyeWearResultsPage;
import pages.HomePage;

public class AddToCartTest extends TestBase {
	
	
	HomePage homeObject ;
	AllAccessoriesPage allaccessoriesObject ;
	EyeWearResultsPage eyewearresultsObject ;
	AddToCartPage addtocartObject ;
	
	
	
	
	@Test (priority = 1)
	
	public void addToCart () throws FileNotFoundException, IOException, ParseException
	
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
		
		
	}

}
