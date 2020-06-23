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

public class Circle extends Area {
	
	public static void main (String[]args) {
		
	
	Circle ob=new Circle();
	int circle = ob.widith+ob.length;
	
	System.out.println(circle);

	}
	
}