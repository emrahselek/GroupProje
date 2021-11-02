package californiaProject.pages;

import californiaProject.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefautPage {
    public DefautPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "Log in")
    public WebElement logInButton;
}
