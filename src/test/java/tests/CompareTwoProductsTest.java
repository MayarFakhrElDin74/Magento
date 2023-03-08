package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.SearchResultsPage;

public class CompareTwoProductsTest extends TestBase {
	
	HomePage homeObject ;
	SearchResultsPage searchresultsObject ;
	
	
String addtocomparelistmsg = "has been added to comparison list." ;



@Test (priority = 1)

public void compareTwoProducts () throws FileNotFoundException, IOException, ParseException

{
	
	JsonDataReader jsonDataReader = new JsonDataReader() ;
	jsonDataReader.jsonReader();
	
	homeObject = new HomePage(driver) ;
	homeObject.searchProduct(jsonDataReader.firstproductname);
	
	searchresultsObject = new SearchResultsPage(driver) ;
	searchresultsObject.addProductToCompareList();
	assertTrue(addtocomparelistmsg.contains("has been added to comparison list.")) ;
	
	searchresultsObject.addSecondProductToCompareList(jsonDataReader.secondproductname);
	searchresultsObject.compareTwoProducts();

	
}


}
