package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue= {"StepDefinition"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports/report.html", "json:target/JASONReports/report.json", "junit:target/JunitReports/report.xml"})
public class RunnerClass {

}
