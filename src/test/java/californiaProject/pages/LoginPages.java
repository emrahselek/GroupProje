package californiaProject.pages;

import californiaProject.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //login page username xpath
    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userName;

    //login page password xpath
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passWord;

    //login page log in button xpath
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement logInButton;
}
