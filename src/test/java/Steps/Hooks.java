package Steps;


import Sites.ElUniversalSite;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystemNotFoundException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    protected WebDriver driver;
    public ElUniversalSite elUniversalSite;


    public void createDriver() {
        String path;
        //path = ".\\src\\test\\java\\resources\\drivers\\chromedriver.exe";

        //System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        this.driver = driver;
        elUniversalSite = new ElUniversalSite(this.driver);
    }

    private void getPropValues() throws IOException {

        Properties prop = new Properties();

        //System.getProperty("user.dir") + ".\\src\\test\\java\\resources\\configuration\\data.properties";

        String propFilename = ".\\src\\test\\java\\resources\\configuration\\data.properties";
        InputStream inputStream = new FileInputStream(propFilename);
        if (inputStream != null) {
            prop.load(inputStream);
        } else {
            FileSystemNotFoundException ex = new FileSystemNotFoundException();
            ex.printStackTrace();
        }
        /*url = prop.getProperty("url");
        state = prop.getProperty("state");
        phone = prop.getProperty("phone");*/
    }



public ElUniversalSite getElUniversalSite()
{

    return elUniversalSite;
}

    @Before
    public void load()
    {
        createDriver();

    }

    @After
    public void quit()
    {
        driver.quit();
        elUniversalSite = null;
    }
}
