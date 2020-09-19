import methods.Methods;
import org.junit.*;
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

    @Ignore
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

    @Ignore
    @Test
    public void socialLinkTestTwitter(){
        method = new Methods(driver);
        method.selectSocialLink("twitter");
        Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/SeleniumHQ");
    }

    @Ignore
    @Test
    public void socialLinkTestFacebook(){
        method = new Methods(driver);
        method.selectSocialLink("facebook");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/Selenium2.WebDriver");
    }

    @Ignore
    @Test
    public void socialLinkTestGithub(){
        method = new Methods(driver);
        method.selectSocialLink("github");
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/SeleniumHQ/selenium");
    }

    @Ignore
    @Test
    public void searchInputTest(){
        method = new Methods(driver);
        method.searchInput("Selenium");
        Assert.assertTrue(driver.getCurrentUrl().contains("Selenium"));
    }

    @Test
    public void downloadTool(){
        method = new Methods(driver);
        method.downloadSelenium("webdriver");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/downloads/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
