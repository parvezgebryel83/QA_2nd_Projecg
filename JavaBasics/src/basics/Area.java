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

public class Area extends Common {
	
	//parent class -- class
	//super class -- sub class
	public static void main (String[]args) {
		Area ob= new Area();
		ob.addition();
		int area = ob.widith*ob.length;
				System.out.println("This is area ="+area);
	}
}