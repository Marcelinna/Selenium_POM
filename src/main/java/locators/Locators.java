package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Locators {

    @FindBy(css = "#navbar a.nav-item")
    private List<WebElement> navLink;

    public List<WebElement> getNavLink() {
        return navLink;
    }

    public void setNavLink(List<WebElement> navLink) {
        this.navLink = navLink;
    }

    @FindBy(css = ".social-icons a")
    private List<WebElement> socialLink;

    public List<WebElement> getSocialLink() {
        return socialLink;
    }

    public void setSocialLink(List<WebElement> socialLink) {
        this.socialLink = socialLink;
    }

    @FindBy(css ="#gsc-i-id1")
    private WebElement searchInput;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(WebElement searchInput) {
        this.searchInput = searchInput;
    }

    @FindBy(css = ".download-button")
    private List<WebElement> download;

    public List<WebElement> getDownload() {
        return download;
    }

    public void setDownload(List<WebElement> download) {
        this.download = download;
    }

    @FindBy(css ="input[type='image']")
    private WebElement donate;

    public WebElement getDonate() {
        return donate;
    }

    public void setDonate(WebElement donate) {
        this.donate = donate;
    }
}
