package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src\\test\\resources\\Features\\Reqres.feature"},
        glue= "RSProcessStepDefinitions",
        dryRun=false,
        monochrome=true,
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class Reqres_Runner {
}
