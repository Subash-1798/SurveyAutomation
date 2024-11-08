package Page_objects_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class  AddQuestion {
	
	
	public static  WebElement Question1(WebDriver driver) {
		
		return driver.findElement(By.xpath("//span[text()='Add Question']"));
		
	}
	
	public static  WebElement Duplicate(WebDriver driver) {
		
		return driver.findElement(By.xpath("(//span[text()='Duplicate'])[2]"));
		
	}
	
    public static  WebElement Required(WebDriver driver) {
		
		return driver.findElement(By.xpath("(//span[text()='Required'])[2]"));
		
	}
	
    public static  WebElement Delete(WebDriver driver) {
		
		return driver.findElement(By.xpath("(//span[text()='Delete'])[3]"));
		
	}
	
    
    public static  WebElement Longtext(WebDriver driver) {
		
		return driver.findElement(By.xpath("(//div[@title=\"Long Text\"])[1]"));
		
	}

	public static  WebElement CreateTemplateSurvey (WebDriver driver) {
		
		 return driver.findElement(By.xpath("//button[text()=\"Create Template Survey\"]"));
	}


}
