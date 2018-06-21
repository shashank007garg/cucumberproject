package StepDefination;


import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	public WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"Q:\\selenium\\chrome driver new\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();

	}

	@When("^title of login page is freecrm$")
	public void title_of_login_page_is_freecrm() throws Throwable {
		Assert.assertEquals(driver.getTitle(),
				"Free CRM software in the cloud powers sales and customer service");

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");

	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement clickButton=driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickButton);

	}

//	@Then("^login should be successfull$")
//	public void login_should_be_successfull() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertEquals("CRMPRO", driver.getTitle());
//
//	}

	@After
	public void tearDown(){
		driver.quit();
	}
}
