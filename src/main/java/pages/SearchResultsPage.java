package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends PageBase {

	public SearchResultsPage(WebDriver driver) {
		super(driver);

	}


	public void addProductToCompareList ()

	{
		WebElement addToCompareLink = 
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/ul/li[1]/div/div[2]/ul/li[2]/a")) ;

		clickBtn(addToCompareLink);
		
		String addtocomparelistmsg = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/ul/li/ul/li/span")).getText() ;
		System.out.println(addtocomparelistmsg) ;

	}



	public void addSecondProductToCompareList (String secondproductname)

	{
		
		System.out.println(secondproductname);
		
		WebElement addSecondProductToCompareLink = 
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/ul/li[2]/div/div[2]/ul/li[2]/a")) ;

		clickBtn(addSecondProductToCompareLink) ;

	}



	public void compareTwoProducts ()

	{
		WebElement compareBtn =
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[3]/div/div[2]/div/button/span/span")) ;

		clickBtn(compareBtn) ;
	
	}



	

}
