package es.selenium;

import org.openqa.selenium.edge.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSeleniumEdge extends DriverSelenium {
	
	
	public DriverSeleniumEdge() {
	final StringBuilder path = new StringBuilder();
	
	path.append("C:\\geckodriver\\MicrosoftWebDriver.exe");
	
	System.setProperty("webdriver.edge.driver",path.toString());
	driver = new EdgeDriver();
	driver.manage().window().maximize();

	}
}
