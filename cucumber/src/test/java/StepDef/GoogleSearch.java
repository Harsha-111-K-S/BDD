package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver =null;
	@Given("browser is open")
	public void browser_is_open() {
		String path =System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
	    
	}

	@And("user is on the browser")
	public void user_is_on_the_browser() {
	    driver.navigate().to("https://google.com");
	    
	}

	@When("enters the text in search bar")
	public void enters_the_text_in_search_bar() {
		driver.findElement(By.name("q")).sendKeys("Codersclub.in");
	}

	@And("clicks on enter")
	public void clicks_on_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the search page")
	public void user_is_navigated_to_the_search_page() {
		driver.getPageSource().contains("About us");
		
		}
	@And("navigae to about us")
	public void navigae_to_about_us() {
	  driver.navigate().to("http://www.codersclub.in/");
	  
	}
}
