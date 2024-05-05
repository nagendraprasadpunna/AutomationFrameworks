package utilities;

import org.openqa.selenium.WebElement;

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

}
