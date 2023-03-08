package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends PageBase{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void fillCheckoutInfo 
	(String adress , String city , String state , String zip , String country , String telephone)
	
	{
		
		WebElement billingAdressList = driver.findElement(By.id("billing-address-select")) ;
		
		select = new Select(billingAdressList) ;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)) ;
		select.selectByVisibleText("New Address");
		
		WebElement adressTxtBox = driver.findElement(By.id("billing:street1")) ;
		adressTxtBox.clear();
		setTextElementText(adressTxtBox, adress);
		
		WebElement cityTxtBox = driver.findElement(By.id("billing:city")) ;
		cityTxtBox.clear();
		setTextElementText(cityTxtBox, city);
		
		
		WebElement countryList = driver.findElement(By.id("billing:country_id")) ;
		select = new Select(countryList) ;
		select.selectByVisibleText(country);
		
		WebElement stateList = driver.findElement(By.id("billing:region_id")) ;
		
		select = new Select(stateList) ;
		select.selectByVisibleText(state);
		
		WebElement zipTxtBox = driver.findElement(By.id("billing:postcode")) ;
		zipTxtBox.clear();
		setTextElementText(zipTxtBox, zip);
		
		WebElement telephoneTxtBox = driver.findElement(By.id("billing:telephone")) ;
		telephoneTxtBox.clear();
		setTextElementText(telephoneTxtBox, telephone);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)) ;
		
		WebElement shipToThisAdressBox = driver.findElement(By.id("billing:use_for_shipping_yes")) ;
		clickBtn(shipToThisAdressBox);
		
		
		WebElement billingInfoContinueBtn = 
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button/span/span")) ;
		clickBtn(billingInfoContinueBtn) ;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;
		
		
		WebElement shippingMethodContinueBtn = 
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")) ;
		clickBtn(shippingMethodContinueBtn) ;
		
		
		WebElement cashOnDeliveryBox = driver.findElement(By.id("p_method_cashondelivery")) ;
		clickBtn(cashOnDeliveryBox) ;
		
		
		WebElement paymentInfoContinueBtn = 
		driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button/span/span")) ;
		clickBtn(paymentInfoContinueBtn) ;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)) ;
		
		WebElement placeOrderBtn = driver.findElement(By.cssSelector("button.button.btn-checkout")) ;
		clickBtn(placeOrderBtn) ;
		
	}

}
