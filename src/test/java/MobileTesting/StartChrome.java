package MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
//https://stackoverflow.com/questions/35305889/unresponsive-appium-server-device-offline-problems
public class StartChrome {

	
	@Test(enabled =false)
	public void MobileBroswer() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME , "LAVA PRAJU");
		capabilities.setCapability(MobileCapabilityType.VERSION , "4.4.2");
		capabilities.setCapability("chromedriverExecutable", "D:\\AppiumForMobile\\chromedriver.exe");
	
		URL url = new URL ("http://127.0.0.1:4727/wd/hub");			
		 
		WebDriver driver = new AndroidDriver(url,capabilities); 
		driver.get("https://m.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("ANGAD");
		driver.findElement(By.name("pass")).sendKeys("PRAJU");
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(enabled = true)
	public void MobileApplication() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Lava Praju");
		capabilities.setCapability("platformVersion","4.4.2");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("appPackage","com.google.android.gm");
		//capabilities.setCapability("appPackage","io.selendroid.testapp");
		capabilities.setCapability("appActivity","com.android.email.activity.setup.OAuthAuthenticationActivity");
		
		//capabilities.setCapability("appActivity","com.google.android.gm.ConversationListActivityGmail");
		
		//capabilities.setCapability("appActivity",".activities.PeopleActivity");
		
		URL url = new URL("http://127.0.0.1:4727/wd/hub");			
		 
		WebDriver driver = new AndroidDriver(url,capabilities); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("ANGAD I LOVE YOU"); 
		driver.findElement(By.id("com.google.android.gm:id/text_layout")).click();
		Thread.sleep(2000);
	}
	
    //AppiumDriver<WebElement> driver;

    @Test(enabled= false)
    public void SetupTest() throws MalformedURLException, InterruptedException
    {
    	DesiredCapabilities capabilities = DesiredCapabilities.android();
    	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
    	capabilities.setCapability("appPackage","io.selendroid.testapp");
    	capabilities.setCapability("deviceName", "Android");
    	
    	
    	DefaultExecutor executor = new DefaultExecutor();
        DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
        capabilities.setCapability("deviceName","Google Nexus 10");   
        capabilities.setCapability("platformVersion", "4.2.2");
        capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("app","G:/appium/apk/cz.hipercalc.apk");
        capabilities.setCapability("appPackage","io.selendroid.testapp");
    	capabilities.setCapability("appActivity",".HomeScreenActivity");
    	
    	URL url = new URL("http://127.0.0.1:4725/wd/hub");	
    	AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(url,capabilities);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).clear();
		//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("ANGAD LOVE YOUUUUUUUU ");
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).clear();
		driver.findElementByClassName("android.widget.EditText").sendKeys("PRAJU");
		
		//driver.findElementByID
		Thread.sleep(1000);
		
    }
}
