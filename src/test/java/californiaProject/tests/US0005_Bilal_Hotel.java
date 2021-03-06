package californiaProject.tests;

import californiaProject.pages.HotelListPages;
import californiaProject.pages.RoomReservationPages;
import californiaProject.utilities.ConfigReader;
import californiaProject.utilities.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US0005_Bilal_Hotel {
        RoomReservationPages roomReservationPages;
        HotelListPages hotelListPages;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        roomReservationPages = new RoomReservationPages();
        hotelListPages = new HotelListPages();
        Driver.getDriver().get(ConfigReader.getProperty("test_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1-Enter Concorthotel as a manager
        hotelListPages.mainPageLoginLink.click();

        hotelListPages.userName.sendKeys(ConfigReader.getProperty("manager_username"));
        hotelListPages.passWord.sendKeys(ConfigReader.getProperty("manager_password"));
        Thread.sleep(1000);
        hotelListPages.logInButton.click();

    }
@Test
    public void us0005_TC0001(){
        hotelListPages.hotelManagement.click();
        hotelListPages.hotelList.click();

    }
}
