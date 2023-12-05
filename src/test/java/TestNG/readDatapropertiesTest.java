package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class readDatapropertiesTest {

	public WebDriver d;
	@Test
	public void demo2Test() throws IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("src\\test\\resources\\jenkins.properties");
		Properties p= new Properties();
		p.load(file);
		String browser = p.getProperty("Browser");
		String url = p.getProperty("URL");
		String user = p.getProperty("Username");
		String pass= p.getProperty("Password");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			d=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			d=new EdgeDriver();
		}else {
			d=new FirefoxDriver();
		}
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(url);
		d.findElement(By.name("user_name")).sendKeys(user);
		d.findElement(By.name("user_password")).sendKeys(pass);
		d.findElement(By.id("submitButton")).click();
		System.out.println("Good morning");
		Thread.sleep(2000);
		d.quit();
	}
}
