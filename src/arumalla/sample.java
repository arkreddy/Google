package arumalla;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample{
	
    
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");

		
		  System.setProperty("webdriver.chrome.driver",
		  "/Users/rarumalla/chromedriver");
		  WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Leaning Selenium");
        element.submit();
		
	}
}