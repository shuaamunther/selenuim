package najah.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFacebookWithJUnit {
static WebDriver driver;

@Before
public void setUp()throws Exception {
	
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
	driver = new FirefoxDriver();
	
	
}
@After 
public void tearDown() throws Exception {
	//driver.quit();
}

@Test
public void test() {
	//file("Not yet implemented");
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("shahdabdo50@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("shushu@1234567");
	driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
}






}
