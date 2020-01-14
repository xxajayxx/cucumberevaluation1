package pack1;
//Owner:Ajaypal Singh
//Description: to use cucumber feature file to generate methods(using BDD approach)  
//and perform login with parameterization
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
public class Eval {
static WebDriver driver;
	
	@Given("navigate to homepage")
	public void navigate_to_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\users\\training_d2.03.07\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath(".//a[@href='index.html']"));
		
	}
	@When("user enter the username and passwor{string} {string}")
	public void user_enter_the_username_and_password(String string, String string2) {
		
		
		driver.findElement(By.xpath(".//input[@id='userName']")).sendKeys(string);
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys(string2);
		driver.findElement(By.xpath(".//input[@name='Login']")).click();
		
		
	}
	@Then("message login successfully")
	public void message_login_successfully() {
	 String title=	driver.getTitle();
	 if(title=="Home") {
	Assert.assertTrue(driver.getTitle().contains("Home"));
	
	 }else {
		 Assert.fail("Title not found");
		 
	 }
	
	 Assert.assertTrue(driver.findElement(By.xpath(".//ul[@class='nav navbar-nav']")).getText().contains("Hi"));
	
		
		
		
	}
	
	//Expected Output: The page wil open up and perform
	

}
