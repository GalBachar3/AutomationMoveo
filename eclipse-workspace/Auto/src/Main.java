import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		jhsahjsagjfAGFAGFJKGFFAGFa
		System.setProperty("webdriver.chrome.driver","C:/Users/adird/Downloads/chromedriver_win32/chromedriver.exe" );
		
		System.setProperty("webdriver.chrome.driver","C:/Users/adird/Downloads/chromedriver_win32/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.moveo.group/careers");
		 
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='application form']")));
		 WebElement element=driver.findElement(By.className("form-input"));
		 element.sendKeys("Adir Golbar");
		 Thread.sleep(2000);
		 System.out.print("succeed");
		 
		 driver.findElement(By.xpath("//*[@id=\'answer-email\']/div/div/input")).sendKeys("adirdoor@gmail.com");
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\'dropdown-menu-id\']/div/div/div[1]/div[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\'dropdown-menu-id\']/div/div/div[1]/div[1]"));

		
		 element = driver.findElement(By.cssSelector("#answer-status5 input"));
		 element.sendKeys("Full-Stack Web Developer");
		 element.sendKeys(Keys.RETURN);

		 
		 element=driver.findElement(By.cssSelector("#answer-status_1 input"));
		 element.sendKeys("check");
		 element.sendKeys(Keys.RETURN);

		 //validate

		
		 System.out.println(element);



		 
		 Thread.sleep(2000);
		
		System.out.print("succeed"); 	 
		
		driver.quit();
		

	}

}
