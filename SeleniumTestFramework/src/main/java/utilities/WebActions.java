package utilities;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebActions {
	
	public static void ClickActions(WebElement element) {
		
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Element Not Found!!!");
		}
		
	}

//	public static void ClickActions(WebElement about_Element) {
//		// TODO Auto-generated method stub
//		
//	}
	public static void verifyOnRightPage( String ActualText,String ExpectedText){
		Assert.assertEquals(ActualText, ExpectedText);
	}

}
