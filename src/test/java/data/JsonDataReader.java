package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	
public String firstname , lastname , email , password , productquantity , firstproductname , secondproductname ,
adress , city , state , zip , country , telephone , reviewtxt , summaryreviewtxt , nicknametxt ;
 ;
	
	
	public void jsonReader () throws FileNotFoundException, IOException, ParseException 
	{
		
		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\data\\UserData.Json" ;
		File srcFile = new File(filePath) ;
		
		JSONParser parser = new JSONParser() ;
		JSONArray jArray = (JSONArray)parser.parse(new FileReader(srcFile)) ;
		
		for (Object jsonObject : jArray) {
			
			JSONObject person = (JSONObject) jsonObject ;
			
			firstname = (String)person.get("firstname") ;
			System.out.println(firstname);
			
			lastname = (String)person.get("lastname") ;
			System.out.println(lastname);
			
			email = (String)person.get("email") ;
			System.out.println(email);
			
			password = (String)person.get("password") ;
			System.out.println(password);	
			
			productquantity = (String)person.get("productquantity") ;
			System.out.println(productquantity);
			
			firstproductname = (String)person.get("firstproductname");
			System.out.println(firstproductname);
			
			secondproductname = (String)person.get("secondproductname");
			System.out.println(secondproductname);
			
			adress = (String)person.get("adress") ;
			System.out.println(adress);
			
			city = (String)person.get("city") ;
			System.out.println(city) ;
			
			state = (String)person.get("state") ;
			System.out.println(state) ;
			
			zip = (String)person.get("zip") ;
			System.out.println(zip) ;
			
			country = (String)person.get("country") ;
			System.out.println(country) ;
			
			telephone = (String)person.get("telephone") ;
			System.out.println(telephone) ;
			
			reviewtxt = (String)person.get("reviewtxt") ;
			System.out.println(reviewtxt) ;	
					
			summaryreviewtxt = (String)person.get("summaryreviewtxt") ;
			System.out.println(summaryreviewtxt) ;
			
			nicknametxt = (String)person.get("nicknametxt") ;
			System.out.println(nicknametxt) ;
			
		}
		
	}


}
