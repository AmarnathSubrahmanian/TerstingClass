package JUnitPackage;

import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class LinkValidation {
	
	String baseurl = "https://www.google.com/";
	
	@Test
	public void test()
	{
		try {
			URL u = new URL(baseurl);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			int code = con.getResponseCode();
			System.out.println(code);
			
			if(code==200)
			{
				System.out.println("Response code is 200 - Successfull");
			}
			else
			{
				System.out.println("Not Expected");
			}
		    }
		
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		}
	}
}
