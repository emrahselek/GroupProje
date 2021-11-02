package californiaProject.tests;

import californiaProject.utilities.ConfigReader;
import californiaProject.utilities.Driver;
import org.testng.annotations.Test;

public class TC_001 {


    @Test
    public void testAddressLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("test_url"));
    }
}
