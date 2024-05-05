package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseSetup.BaseTest;

public class ElementsFetch {
	
	public WebElement getWebElement(String IndentiferType, String IndentifierValue) {
		switch(IndentiferType) {
		case "ID":
			return BaseTest.driver.findElement(By.id(IndentifierValue));
		case "CLASSNAME":
			return BaseTest.driver.findElement(By.className(IndentifierValue));
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(IndentifierValue));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(IndentifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(IndentifierValue));
			
			default:
				return null;			
		}
		
	}
	
	public List<WebElement> getWebElements(String IndentiferType, String IndentifierValue) {
		switch(IndentiferType) {
		case "ID":
			return BaseTest.driver.findElements(By.id(IndentifierValue));
		case "CLASSNAME":
			return BaseTest.driver.findElements(By.className(IndentifierValue));
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(IndentifierValue));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(IndentifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(IndentifierValue));
			
			default:
				return null;			
		}
		
	}

}
