package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics2 {

	WebDriver driver;
	
	
	public  void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parve\\Downloads\\JAVA\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
	}

}
