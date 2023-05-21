package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//monochrome = true, it will plain english will give a output on what we give on our feature file.
		monochrome = true,
		//plugin = {"pretty"} it will give me output with steps dif (random char).
		//"html:target/html-cucumber" it will creat me on report with HTML formet.
		//json:target/cucumber.json it will give good looking output Junit
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src\\test\\java\\featurs",
		glue = "stepdefs",
		//tags = {"@Sanity"}
		//tags = {"@WIP"}//its call work in process its just a name of test. anything we have to give in feature file. 
		//tags = {"@regressions or @Sanity"}//either @regressions or @Sanity
		//tags = {"@regressions and @Sanity"} //both tages should be run
		//tags = {"@Calcultor"} //it is featurs leavel of tage. it mean we will give this tage on above feature 
		//tags = {"not @WIP"}//it will help me to run all the testcase except Work in process (WIP).
		  tags = {"@Browser and not @WIP"}//it will rull all the test case in Browser except Work in process (WIP.
		)
public class TestRunner {
	
	

}
