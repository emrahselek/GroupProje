package californiaProject.tests;

import californiaProject.pages.RoomReservationPages;
import californiaProject.utilities.ConfigReader;
import californiaProject.utilities.Driver;
import californiaProject.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US008_Orcun_Hotel {

    RoomReservationPages roomReservationPages;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        roomReservationPages = new RoomReservationPages();
        Driver.getDriver().get(ConfigReader.getProperty("test_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        roomReservationPages.mainPageLoginLink.click();
        roomReservationPages.userName.sendKeys(ConfigReader.getProperty("manager_username"));
        roomReservationPages.passWord.sendKeys(ConfigReader.getProperty("manager_password"));
        Thread.sleep(1000);
        roomReservationPages.logInButton.click();
    }
    @Test (priority = 0)
    public void us08_TC001() throws InterruptedException {
        roomReservationPages.homeManagement.click();
        roomReservationPages.roomReservations.click();
        roomReservationPages.addRoomReservation.click();
        Select selectFirstIDUser = new Select(roomReservationPages.firstSelectIdUSer);
        selectFirstIDUser.selectByVisibleText("manager");
        Select selectSecondIDUser = new Select(roomReservationPages.secondSelectIdUSer);
        selectSecondIDUser.selectByValue("34");
        roomReservationPages.price.sendKeys(ConfigReader.getProperty("roomreservation_price"));
        roomReservationPages.dateStart.sendKeys("11/17/2021");
        roomReservationPages.dataEnd.sendKeys("11/26/2021");
        roomReservationPages.adultAmount.sendKeys("2");
        roomReservationPages.childrenAmount.sendKeys("2");
        roomReservationPages.contactNameSurname.sendKeys("Violet Vivaldi");
        roomReservationPages.contactPhone.sendKeys("477-432-4466");
        roomReservationPages.contactEmail.sendKeys("violetvivaldi@gmail.com");
        roomReservationPages.notes.sendKeys("This is a notes");
        roomReservationPages.approved.click();
        roomReservationPages.isPaid.click();
        ReusableMethods.waitFor(2);
        roomReservationPages.saveButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(roomReservationPages.popupMessage));
        Assert.assertTrue(roomReservationPages.popupMessage.isDisplayed());
        roomReservationPages.clickOk.click();
    }

}
