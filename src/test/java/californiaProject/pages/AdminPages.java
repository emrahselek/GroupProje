package californiaProject.pages;

import californiaProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPages {
    public AdminPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //home managemenet
    @FindBy(linkText = "Hotel Management")
    public WebElement homeManagement;

    //room reservation
    @FindBy (linkText = "Room reservations")
    public WebElement roomReservations;
}
