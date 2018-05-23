package es.selenium;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;

public class Main {
	static DriverSeleniumChrome prueba1 = new DriverSeleniumChrome();
	 public static void gira() {
		 		prueba1.getDriver().findElement(By.tagName("body")).sendKeys(Keys.ARROW_LEFT);
		 		prueba1.getDriver().findElement(By.tagName("body")).sendKeys(Keys.ARROW_LEFT);
				prueba1.getDriver().findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
				prueba1.getDriver().findElement(By.tagName("body")).sendKeys(Keys.ARROW_LEFT);
				prueba1.getDriver().findElement(By.tagName("body")).sendKeys(Keys.ARROW_UP);
	 }
	
	public static void main(String[] args) throws IOException {
//		DriverSeleniumFirefox prueba = new DriverSeleniumFirefox();
//		DriverSeleniumFirefox prueba2 = new DriverSeleniumFirefox();
//		DriverSeleniumFirefox prueba3 = new DriverSeleniumFirefox();
//		DriverSeleniumEdge prueba2 = new DriverSeleniumEdge();
//		prueba.getDriver().get("https://google.com");
//		
//		prueba.getDriver().findElement(By.id("lst-ib")).sendKeys("lista de convocados selección española mundial 2018 rtve");
//		
//		prueba.getDriver().findElement(By.name("btnK")).click()
//		
//		System.out.println(prueba.getDriver().findElement(By.id("resultStats")).getText());
//		
//		prueba.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE.es")).click();
//		
//		List<WebElement> lista = prueba.getDriver().findElement(By.className("section")).findElements(By.tagName("p"));
//		
//		lista.stream().forEach(p -> System.out.println(p.getText()));
		
//		for (WebElement l : lista) {
//			System.out.println(l.getText());
//		}
		
		
//		prueba.cerrarProceso();
		
//		try {
//		
//		prueba2.getDriver().get("https://google.com");
//		
//		prueba2.getDriver().findElement(By.id("lst-ib")).sendKeys("lista de con primefaces showcase");
//		
//		prueba2.getDriver().findElement(By.name("btnK")).click();
//		
//		prueba2.getDriver().findElement(By.partialLinkText("PrimeFaces ShowCase")).click();
//		
//		prueba2.getDriver().findElement(By.id("SubMenu-Data")).click();
//		
//		prueba2.getDriver().findElement(By.partialLinkText("DataTable")).click();
//		
//		List<WebElement> lista2 = prueba2.getDriver().findElement(By.id("j_idt115_data")).findElements(By.tagName("tr"));
//		
//		lista2.stream().forEach(l -> System.out.println(l.getText()));
//		
//		
//		}catch(org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Elemento no encontrado");
//		}
//		prueba2.cerrarProceso();
		
//		try {
//		Actions action = new Actions(prueba3.getDriver());
//			
//		prueba3.getDriver().get("https://www.eltiempo.es/");
//		
//		
//		
//		prueba3.getDriver().findElement(By.id("inputSearch")).sendKeys("Écija");
//		
//		prueba3.getDriver().findElement(By.className("form_search_submit")).click();
//		
//		prueba3.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();
//		
//
//		
//		prueba3.getDriver().findElements(By.className("m_table_weather_day_temp_wrapper")).stream()
//		.filter(p -> p.getAttribute("outerHTML").contains("25 May, 14:00")).findFirst().get().click();
//		
//		prueba3.getDriver().findElement(By.className("table_tooltip_wrapper")).findElements(By.tagName("p")).stream().forEach(p->System.out.println(p.getText()));
//		
//		
//		
//		
//		
//		
//				
//		}catch(org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Elemento no encontrado");
//		}
//		prueba3.cerrarProceso();
		
//		prueba1.getDriver().navigate().to("http://google.com");
//		
//		prueba1.cerrarProceso();
		
//		try {
//		
//			prueba2.getDriver().navigate().to("https://www.eltiempo.es/");
//			
//			
//			
//			prueba2.getDriver().findElement(By.id("inputSearch")).sendKeys("Écija");
//			
//			prueba2.getDriver().findElement(By.className("form_search_submit")).click();
//			
//			final WebDriverWait wait = new WebDriverWait(prueba2.getDriver(), 20);
//			
//			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Écija, Sevilla")));
//			
//			prueba2.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();
//			
//	
//			
//			prueba2.getDriver().findElements(By.className("m_table_weather_day_temp_wrapper")).stream()
//			.filter(p -> p.getAttribute("outerHTML").contains("25 May, 14:00")).findFirst().get().click();
//		
//		
//
//		}catch(org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Elemento no encontrado");
//		}
//		prueba2.cerrarProceso();
//		
		
		prueba1.getDriver().get("https://gabrielecirulli.github.io/2048/");
		try {
			for (int z = 0;; z++) {
				Main.gira();
			}
		}catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Elemento no encontrado");
		
		prueba1.cerrarProceso();
	}
	}
}

