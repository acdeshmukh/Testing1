package Runner;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

import java.io.File;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/maven/ArtifactID1_Anand/FeatureFiles/FeautreFile.feature",
                 glue = "StepDefination" ,
                 plugin = {"html:target/cucumber-html-report" ,
                		 // "pretty:STDOUT","html:D:\\maven\\ArtifactID1_Anand\\test-output\\REPORTS\\cucumber-pretty",
                		  // "json:D:\\maven\\ArtifactID1_Anand\\test-output\\REPORTS\\cucumber-json\\cucumber.json",
                		   //"com.cucumber.listener.ExtentCucumberFormatter:D:\\maven\\ArtifactID1_Anand\\test-output\\REPORTS\\cucumber-extent\\report.html"
                		},
                 
                 tags = {"@Scenario1" },
                 monochrome= true)
public class Test_FinacePortalWithCucumber extends AbstractTestNGCucumberTests {

//	@AfterClass
//	public static void  reportSetup()
//	{
//	
//		Reporter.loadXMLConfig(new File("D:/maven/ArtifactID1_Anand/extent-config.xml"));
//		Properties P = System.getProperties();
//		P.list(System.out);
//	}	
	
}
