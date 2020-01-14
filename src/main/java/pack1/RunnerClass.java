package pack1;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\test\\Evaluation\\Features\\Features.feature", glue="pack1")
	public class RunnerClass{
		
		
		
	}

//The above mentioned imports are not working due to null  point exception being thrown by the eclipse
	// this is due to the build path updater is throwing an internal error
