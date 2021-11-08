package californiaProject.pages;

import californiaProject.utilities.ConfigReader;
import californiaProject.utilities.Driver;
import californiaProject.utilities.ReusableMethods;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPages {



public MainPages(){
        PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(linkText = "Log in")
public WebElement mainPageLoginLink;

public static void adminSetUp (String username, String password){
LoginPages loginPages = new LoginPages();
MainPages mainPages = new MainPages();
Driver.getDriver().get(ConfigReader.getProperty("test_url"));
Driver.getDriver().manage().window().maximize();
Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
mainPages.mainPageLoginLink.click();
loginPages.userName.sendKeys(ConfigReader.getProperty("manager_username"));
loginPages.passWord.sendKeys(ConfigReader.getProperty("manager_password"));
ReusableMethods.waitFor(2);
loginPages.logInButton.click();
}
}
