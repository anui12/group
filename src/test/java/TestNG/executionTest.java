package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class executionTest {

	@Test
	public void Facebook() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	@Test(groups="food")
	public void swiggy() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.swiggy.com/");
	}
	@Test(groups="food")
	public void Zomato() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.zomato.com/india");
	}
}
