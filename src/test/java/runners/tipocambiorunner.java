package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/Resources/features/tipodecambio.feature"
},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/login.json",
        "html:target/login-html"},
        glue = {"Hooks",
                "Pages",
                "Steps",
                "Sites"}
                )

public class tipocambiorunner {
}
