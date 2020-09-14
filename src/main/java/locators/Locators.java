package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Locators {

    @FindBy (css="#navbar a.nav-item")
    private List<WebElement> navLink;

    public List<WebElement> getNavLink() {
        return navLink;
    }

    public void setNavLink(List<WebElement> navLink) {
        this.navLink = navLink;
    }
}
