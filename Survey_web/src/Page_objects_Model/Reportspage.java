package Page_objects_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Reportspage {


		
		
		public static WebElement Reporticon(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[name()='svg'])[20]"));
			
			
	 }
		
		public static WebElement ViewReports(WebDriver driver) {
			return driver.findElement(By.xpath("//div[text()='View Reports']"));
			
			
	 }
		
		public static WebElement Section1(WebDriver driver) {
			return driver.findElement(By.xpath("//button[text() = 'Section A']"));
			
			
	 }
		public static WebElement staticAnalysis(WebDriver driver) {
			return driver.findElement(By.xpath("//button[text() = 'Statistic Analysis']"));
			
			
	 }
		
		public static WebElement individualquestions(WebDriver driver) {
			return driver.findElement(By.xpath("//span[text()='Individual Questions']"));
			
			
	 }

		
		public static WebElement IndividualResponders(WebDriver driver) {
			return driver.findElement(By.xpath("//span[text()='Individual Responders']"));
			
			
	 }
		public static WebElement SentimentAnalysis(WebDriver driver) {
			return driver.findElement(By.xpath("//span[text()='Sentiment Analysis']"));
			
			
	 }
		public static WebElement down1(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[name()='svg'])[10]"));
			
			
	 }
		
	
}
