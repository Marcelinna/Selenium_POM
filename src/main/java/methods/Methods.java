package methods;

import locators.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.print.PageFormat;

public class Methods {

    WebDriver driver;
    Locators locators;
    WebDriverWait wait;

    public Methods(WebDriver driver){
        this.driver = driver;
        locators = new Locators();
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver,locators);

    }

    public void selectNavLink(String navLinkName){
        for(int i = 0; i<locators.getNavLink().size();i++){
            if(locators.getNavLink().get(i).getText().contains(navLinkName)){
                locators.getNavLink().get(i).click();
                break;
            }
        }
    }
}
