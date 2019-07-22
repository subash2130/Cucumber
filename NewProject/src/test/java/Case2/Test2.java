package Case2;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

		public class Test2 {
			
			 WebDriver driver;
			 WebDriverWait wait;
			
			

	@Given("I want to Enter the URL of TestMe App")
			public void i_want_to_Enter_the_URL_of_TestMe_App() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\subash\\chromedriver_win32\\chromedriver.exe");
			    // Write code here that turns the phrase above into concrete actions
			    //throw new cucumber.api.PendingException();
			driver = new ChromeDriver();
			
			driver.get("http://192.168.40.4:8083/TestMeApp1");
			
			driver.manage().window().maximize();
			
			
			}

	@When("I click on SignIn button")
			public void i_click_on_SignIn_button() {
			    // Write code here that turns the phrase above into concrete actions
			    //throw new cucumber.api.PendingException();
				
				driver.findElement(By.linkText("SignIn")).click();
			}

	@Then("I Enter the {string} and {string}")
			public void i_Enter_the_and(String string, String string2) {
				
				
				driver.findElement(By.id("userName")).sendKeys(string);
				driver.findElement(By.id("password")).sendKeys(string2);

				
			    // Write code here that turns the phrase above into concrete actions
		//   throw new cucumber.api.PendingException();
			}

	@Then("I click the Login Button")
			public void i_click_the_Login_Button() {
				driver.findElement(By.name("Login")).click();

				
			    // Write code here that turns the phrase above into concrete actions
			    //throw new cucumber.api.PendingException();
			}

	@Then("Homepage of TestMe App is Displayed")
			public void homepage_of_TestMe_App_is_Displayed() {
				
				driver.close();
			    // Write code here that turns the phrase above into concrete actions
			    //throw new cucumber.api.PendingException();
			}
	

	}

