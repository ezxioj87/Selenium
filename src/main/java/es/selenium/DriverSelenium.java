package es.selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class DriverSelenium {
	
	static protected WebDriver driver;
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void cerrarProceso() throws IOException{
		
		if(getDriver() instanceof DriverSeleniumFirefox) {
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		} else if(getDriver() instanceof DriverSeleniumEdge) {
			Runtime.getRuntime().exec("taskkill /F /IM MicrosoftWebDriver.exe");
		} else {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		}
		
		System.out.println("Prueba finalizada");
	}

}
