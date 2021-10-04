package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EjitStudentLogin {
	WebDriver driver= null;
	@Given("User is on the Browser")
	public void user_is_on_the_browser() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	   
	}

	@And("User enters the text in the search bar")
	public void user_enters_the_text_in_the_search_bar() {
		 driver.navigate().to("https://google.com");
		 driver.findElement(By.name("q")).sendKeys("ejit gems");
	   
	   
	}

	@When("User clicks on enter")
	public void user_clicks_on_enter() {
		
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User is navigated to the ejit search page")
	public void user_is_navigated_to_the_ejit_search_page() {
	 driver.navigate().to("https://ejit.jyothyit.ac.in/");
	}


	@Then("User has to choose the students option")
	public void user_has_to_choose_the_students_option() {
  
	
      
	}

	@And("User Enters the Username")
	public void user_enters_the_username() {
		driver.findElement(By.id("userId")).sendKeys("1JT18CS020");
	}

	@And("User Enter password")
	public void user_enter_password() {
	   driver.findElement(By.id("password")).sendKeys("harsha123*");
	}

	@When("User click on enter")
	public void user_click_on_enter() {
	   driver.findElement(By.id("staffSubmitButton")).sendKeys(Keys.ENTER);
	}

	@Then("User has to login to his portal")
	public void user_has_to_login_to_his_portal() {
	   
	}

}
