package StepDefination;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SetpDefinationClass {
	WebDriver driver;
	Scenario objScenario;
	
	@Before({"@Scenario1" })
	public void BeforeMethod( Scenario scenario){
		this.objScenario =scenario;
		System.out.println("This stmt is from BeforeMethod for scenario :" + objScenario.getName() );
		
	}
	
	@After({"@Scenario2" })
	public void AfterMethod( Scenario scenario){
		this.objScenario =scenario;
		objScenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
		System.out.println("This stmt is from AfterMethod for scenario :" + objScenario.getName() );
		
	}
	
	@Given("^Finance Portal is open$")
	public void finance_Portal_is_open() throws Exception {
		System.out.println("This stmt is from BackgroundMethod ");
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	}

	//@When("^AuraRole user add comments$")
	@When("^AuraRole (.*) add (.*)$")
	public void aurarole_add(String user, String pwd) throws Exception {
		
        //List<List<String>> data = useridpass.raw();	for (int i=0;i<data.size();i++)		{			System.out.println(data.get(i).toString());		}
		//for (Map<String,String> user : useridpass.asMaps(String.class,String.class))		{			driver.findElement(By.id("email")).sendKeys(user.get("username"));	    driver.findElement(By.id("pass")).sendKeys(user.get("password"));	    driver.get("https://www.facebook.com/");		}
		//	for (POJOuserData user : details ){		driver.findElement(By.id("email")).sendKeys(user.getUsername());			driver.findElement(By.id("pass")).sendKeys(user.getpassword());			driver.get("https://www.facebook.com/");}
			
		
	driver.findElement(By.id("email")).sendKeys(user);	    
	driver.findElement(By.id("pass")).sendKeys(pwd);	  
	}

	@Then("^Comments must get added on report$")
	public void comments_must_get_added_on_report() throws Exception {
//		WebDriverWait wbWait = new WebDriverWait(driver,2);
//		wbWait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_a")));
//		driver.findElement(By.id("u_0_a")).click();
		//System.out.println("***in last mehtod*****");
	    Thread.sleep(1000);
	   // driver.quit();
	}
	
	@And("^Check th para:$")
	public void CheckPara(String pargraph) throws Exception {
		String FromWebsite = "public interface JavascriptExecutor";
	if(FromWebsite.equals(pargraph)== true)
	{
		System.out.println("Pargarph is matching bhau");
	}else
	{
		System.out.println("pargraph==>" +pargraph);
		System.out.println("FromWebsite==>" +FromWebsite);
		System.out.println("Pargarph is NOT matchin bhau");
	}
	
	}
}
