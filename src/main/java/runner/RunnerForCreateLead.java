package runner;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/CreateLead.feature",
                 glue="com/leaftaps/pages",
                 monochrome=true,
                 tags="@Group2")
                
public class RunnerForCreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Lead";
		testDescription ="Create Lead with mandatory fields";
		authors="Vino";
		category ="smoke";
		
	}
}
