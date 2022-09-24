package com.nt.recuired;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends GlobalData {
	
	private WebDriver driver;

	//Opening the Application Automation Script
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","H:\\Software testing\\Jar Files\\ChromeDriver105.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	//Closing the Application
	public void closeAppliacation() {
		driver.close();
	}
	
	//Login into the Application
	public void login() {
		driver.findElement(By.name(user_name)).sendKeys(username);
		driver.findElement(By.name(password_name)).sendKeys(password);
		driver.findElement(By.name(login_name)).click();
	}
	
	//Logout from the Application
	public void logOut() {
		driver.findElement(By.linkText(logout_linktext)).click();
	}
	
	//Enter Into the Application
    public void enterIntoIFrame() {
    	driver.switchTo().frame(frame_id);
    }
    
    //Exit from the Application
    public void exitFromIFrame() {
    	driver.switchTo().defaultContent();
    }
    
    //Add the Employee
    public void addEmployee() {
    	driver.findElement(By.xpath(add_Empbtn)).click();
    	driver.findElement(By.name(enter_emp_first_name)).sendKeys(first_name);
    	driver.findElement(By.name(enter_emp_last_name)).sendKeys(last_name);
    	driver.findElement(By.id(save_emp_id)).click();
    }
}
