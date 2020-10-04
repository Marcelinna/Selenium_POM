package methods;

import locators.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void selectSocialLink (String socialLink){
        for (int i=0; i<locators.getSocialLink().size();++i){
            if(locators.getSocialLink().get(i).getAttribute("href").contains(socialLink)){
                locators.getSocialLink().get(i).click();
                break;
            }
        }
    }

    public void searchInput(String searchName){
        locators.getSearchInput().sendKeys(searchName);
        locators.getSearchInput().sendKeys(Keys.ENTER);
    }

    public void downloadSelenium(String downloadName){
        for (int i =0; i<locators.getDownload().size();i++){
            if(locators.getDownload().get(i).getAttribute("class").contains(downloadName)){
                locators.getDownload().get(i).click();
                break;
            }
        }
    }

    public void clickButtonDonate(){
        locators.getDonate().click();
    }


}
