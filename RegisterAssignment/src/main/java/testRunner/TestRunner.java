package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="stepDefinitions",
		features="featurefiles/register.feature",
		dryRun=false,//It will ensure that everything is in sync with each other like stepdef and feature
		monochrome=false,//Removes unreadable format in console 
		strict=true,//to check implmented methods		
		plugin= {"pretty","json:target/cucumber.json","html:target/cucumber.html"})//pretty gives proper console o/p,and json provides json detailed o/p in target folder.
public class TestRunner
{

}

