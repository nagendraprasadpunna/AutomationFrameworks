package PageObjects;

public interface HomePageElements {
	
	String cssSelector_About = ".rd-navbar-nav > li:nth-child(2) > a";
	String cssSelector_Pricing = ".rd-navbar-nav > li:nth-child(4) > a:nth-child(1)";
	String cssSelector_Support = ".rd-navbar-nav > li:nth-child(5) > a:nth-child(1)";
	
	String xpath_About = "//a[normalize-space()='About']";
	String xpath_Pricing = "//a[normalize-space()='Pricing']";
	String xpath_Support = "//a[normalize-space()='Support']";
}
