package californiaProject.tests;

import californiaProject.pages.AdminPages;
import californiaProject.pages.MainPages;
import californiaProject.pages.RoomReservationPages;
import californiaProject.utilities.*;
import org.openqa.selenium.support.ui.*;
import static org.testng.Assert.*;
import org.testng.annotations.*;

public class US008_Orcun_Hotel {

    RoomReservationPages roomReservationPages ;
    AdminPages adminPages;


    @BeforeMethod
    public void setUp(){
        MainPages.adminSetUp("manager_username", "manager_password");
    }

    @Test (priority = 0)
    public void us08_TC001() throws InterruptedException {
        roomReservationPages = new RoomReservationPages();
        adminPages = new AdminPages();
        adminPages.homeManagement.click();
        adminPages.roomReservations.click();
        roomReservationPages.addRoomReservation.click();
        ReusableMethods.selectFromDropDown(roomReservationPages.firstSelectIdUSer, "manager");
        ReusableMethods.seletFromDropDown(roomReservationPages.secondSelectIdUSer, "63");
        roomReservationPages.price.sendKeys("3000");
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
        assertTrue(roomReservationPages.popupMessage.isDisplayed());
        roomReservationPages.clickOk.click();
    }
    @Test (priority = 1)
    public void us08_TC002(){
        roomReservationPages = new RoomReservationPages();
        adminPages = new AdminPages();
        adminPages.homeManagement.click();
        adminPages.roomReservations.click();
        roomReservationPages.addRoomReservation.click();
        ReusableMethods.selectFromDropDown(roomReservationPages.firstSelectIdUSer, "manager");
        ReusableMethods.seletFromDropDown(roomReservationPages.secondSelectIdUSer, "63");
        roomReservationPages.price.sendKeys("3000");
        roomReservationPages.dateStart.sendKeys("11/17/2021");
        roomReservationPages.dataEnd.sendKeys("11/26/2021");
        roomReservationPages.adultAmount.sendKeys("2");
        roomReservationPages.childrenAmount.sendKeys("2");
        roomReservationPages.contactNameSurname.sendKeys("Violet Vivaldi");
        roomReservationPages.contactPhone.sendKeys("477-432-4466");
        roomReservationPages.contactEmail.sendKeys("");
        roomReservationPages.notes.sendKeys("This is a notes");
        roomReservationPages.approved.click();
        roomReservationPages.isPaid.click();
        ReusableMethods.waitFor(2);
        roomReservationPages.saveButton.click();
        WebDriverWait emailwait = new WebDriverWait(Driver.getDriver(), 10);
        emailwait.until(ExpectedConditions.visibilityOf(roomReservationPages.emailError));
        assertTrue(roomReservationPages.emailError.isDisplayed());
    }
    @Test (priority = 2)
    public void us08_TC003(){
        roomReservationPages = new RoomReservationPages();
        adminPages = new AdminPages();
        adminPages.homeManagement.click();
        adminPages.roomReservations.click();
        roomReservationPages.addRoomReservation.click();
        ReusableMethods.selectFromDropDown(roomReservationPages.firstSelectIdUSer, "manager");
        ReusableMethods.seletFromDropDown(roomReservationPages.secondSelectIdUSer, "63");
        roomReservationPages.price.sendKeys("3000");
        roomReservationPages.dateStart.sendKeys("11/17/2021");
        roomReservationPages.dataEnd.sendKeys("11/26/2021");
        roomReservationPages.adultAmount.sendKeys("2");
        roomReservationPages.childrenAmount.sendKeys("2");
        roomReservationPages.contactNameSurname.sendKeys("Violet Vivaldi");
        roomReservationPages.contactPhone.sendKeys("11122");
        roomReservationPages.contactEmail.sendKeys("violetvivaldi@gmail.com");
        roomReservationPages.notes.sendKeys("This is a notes");
        roomReservationPages.approved.click();
        roomReservationPages.isPaid.click();
        ReusableMethods.waitFor(2);
        roomReservationPages.saveButton.click();
        WebDriverWait phoneWait = new WebDriverWait(Driver.getDriver(), 10);
        phoneWait.until(ExpectedConditions.visibilityOf(roomReservationPages.contactPhoneError));
        assertTrue(roomReservationPages.contactPhoneError.isDisplayed());

    }
    @Test (priority = 3)
    public void us08_TC004(){
        roomReservationPages = new RoomReservationPages();
        adminPages = new AdminPages();
        adminPages.homeManagement.click();
        adminPages.roomReservations.click();
        roomReservationPages.addRoomReservation.click();
        ReusableMethods.selectFromDropDown(roomReservationPages.firstSelectIdUSer, "manager");
        ReusableMethods.seletFromDropDown(roomReservationPages.secondSelectIdUSer, "63");
        roomReservationPages.price.sendKeys("3000");
        roomReservationPages.dateStart.sendKeys("11/17/2021");
        roomReservationPages.dataEnd.sendKeys("11/26/2021");
        roomReservationPages.adultAmount.sendKeys("-2");
        roomReservationPages.childrenAmount.sendKeys("-2");
        roomReservationPages.contactNameSurname.sendKeys("Violet Vivaldi");
        roomReservationPages.contactPhone.sendKeys("477-432-4466");
        roomReservationPages.contactEmail.sendKeys("violetvivaldi@gmail.com");
        roomReservationPages.notes.sendKeys("This is a notes");
        roomReservationPages.approved.click();
        roomReservationPages.isPaid.click();
        ReusableMethods.waitFor(2);
        roomReservationPages.saveButton.click();
        WebDriverWait amountError = new WebDriverWait(Driver.getDriver(), 10);
        amountError.until(ExpectedConditions.visibilityOf(roomReservationPages.popupMessage));
        assertTrue(roomReservationPages.popupMessage.isDisplayed());

    }

    @Test (priority = 4)
    public void us08_TC005(){
        roomReservationPages = new RoomReservationPages();
        adminPages = new AdminPages();
        adminPages.homeManagement.click();
        adminPages.roomReservations.click();
        roomReservationPages.addRoomReservation.click();
        ReusableMethods.selectFromDropDown(roomReservationPages.firstSelectIdUSer, "manager");
        ReusableMethods.seletFromDropDown(roomReservationPages.secondSelectIdUSer, "63");
        roomReservationPages.price.sendKeys("3000");
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
        WebDriverWait amountError = new WebDriverWait(Driver.getDriver(), 10);
        amountError.until(ExpectedConditions.visibilityOf(roomReservationPages.popupMessage));
        assertTrue(roomReservationPages.popupMessage.isDisplayed());

    }



    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
