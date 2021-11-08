package californiaProject.pages;

import californiaProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelListPages {
    public HotelListPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //mainpage login button linktext
    @FindBy(linkText = "Log in")
    public WebElement mainPageLoginLink;

    //login page username xpath
    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userName;

    //login page password xpath
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passWord;

    //login page log in button xpath
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement logInButton;

    //hotel managemenet
    @FindBy (xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagement;

    //hotel list
    @FindBy(linkText = "Hotel List")
    public WebElement hotelList;


}
