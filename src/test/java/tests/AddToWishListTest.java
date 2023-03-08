package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.AddToWishListPage;
import pages.BooksAndMusicProductsPage;
import pages.HomePage;
import pages.LoginPage;

public class AddToWishListTest extends TestBase {

LoginPage loginObject ;
HomePage homeObject ;
BooksAndMusicProductsPage booksMusciObject ;
AddToWishListPage addToWishListObject ;

 String wishlistnotification = "added to your wishlist" ;


	
	@Test (priority = 1)
	public void addProductToWishList () throws FileNotFoundException, IOException, ParseException
	
	{
	
		homeObject = new HomePage(driver) ;
		homeObject.goToBooksAndMusicPage();
		
		booksMusciObject = new BooksAndMusicProductsPage(driver) ;
		booksMusciObject.goToProductDetailsPage();
		
		addToWishListObject = new AddToWishListPage(driver) ;
		addToWishListObject.addToWishList();
		
	}
	
	
	
	@Test (priority = 2)
	
	public void userLogin() throws FileNotFoundException, IOException, ParseException
	
	{
	
	JsonDataReader jsonDataReader = new JsonDataReader() ;
	jsonDataReader.jsonReader();
	
    loginObject = new LoginPage(driver) ;
    loginObject.registeredUserLogin(jsonDataReader.email , jsonDataReader.password) ;
	
	}
	
	
	@Test (priority = 3)
	
	public void confirmAddingToWishlist ()
	
	{
		
	addToWishListObject = new AddToWishListPage(driver) ;
	addToWishListObject.confirmAddingToWishlist();
	
	assertTrue(wishlistnotification.contains("added to your wishlist")) ;

	
	}
	
}
