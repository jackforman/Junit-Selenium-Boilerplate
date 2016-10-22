package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jack.forman on 22/10/2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Tests.Sprint1.class})
public class TestSuite {

    static DriverFactory driverFactory = new DriverFactory();

    @BeforeClass
    public static void suiteSetUp(){
        driverFactory.setDriver();
    }


    @AfterClass
    public static void tearDown(){
        driverFactory.getDriver().quit();
    }

}