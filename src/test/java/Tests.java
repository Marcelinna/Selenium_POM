import methods.Methods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    private WebDriver driver;
    private Methods method;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/");
    }

    @Test
    public void navLinkTest(){
        method = new Methods(driver);
        method.selectNavLink("Downloads");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/downloads/");
        method.selectNavLink("Projects");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/projects/");
        method.selectNavLink("Support");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/support/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
