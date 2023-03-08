package tests;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.AddReviewPage;
import pages.HomePage;
import pages.MenPantsAndDenimPage;
import pages.ProductDetailsPage;

public class AddReviewTest extends TestBase {
	
	
HomePage homeObject ;
MenPantsAndDenimPage menpantsanddenimObject ;
ProductDetailsPage productDetailsObject ;
AddReviewPage addReviewObject ;


String reviewmsg = "Your review has been accepted for moderation." ;
	

	
	@Test (priority = 1)

	public void addReview () throws FileNotFoundException, IOException, ParseException
	
	{
		
		homeObject = new HomePage (driver) ;
		homeObject.goToMenPantsAndDenimPage();
		
		menpantsanddenimObject = new MenPantsAndDenimPage(driver) ;
		menpantsanddenimObject.goToProductDetailsPage();
		
		productDetailsObject = new ProductDetailsPage(driver) ;
		productDetailsObject.openAddReview();
		
		JsonDataReader jsonDataReader = new JsonDataReader() ;
		jsonDataReader.jsonReader();
		
		addReviewObject = new AddReviewPage(driver) ;
		addReviewObject.addReview(jsonDataReader.reviewtxt , jsonDataReader.summaryreviewtxt , jsonDataReader.nicknametxt) ;
		
		
		assertEquals(reviewmsg, "Your review has been accepted for moderation.");
		
	}

}
