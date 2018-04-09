package najah.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestFacebookRegisster {

	static WebDriver driver;
	public static void main(String[]ar) {
		
		System.setProperty("webdriver.gecko.driver", "‪C:\\gecko\\geckodriver.exe");   
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("Shua'a Abdo");
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='month]")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath(".//*[@id='u_0_w']")).click();
	}
	
}
