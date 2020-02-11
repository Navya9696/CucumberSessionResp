package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\Demo1.feature",glue= {"StepDef"},plugin= {"html:target//report.html"},monochrome=true)

public class Demo1_Runner {

}
