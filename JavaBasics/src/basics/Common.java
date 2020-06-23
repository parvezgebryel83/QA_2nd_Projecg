package basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Common {
	WebDriver driver;
	public int widith = 60;
	public int length=80;
	//area=with*length
	//circle=with+lenth
	//square=length-width
	public void addition() {
		int add=length+widith;
		System.out.println(add);
	}

}