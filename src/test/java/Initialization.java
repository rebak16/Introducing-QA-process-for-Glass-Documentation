import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Initialization {

    private static BasePage basePage;

    @BeforeClass
    public static void init() {
        basePage.getDriver();
    }

    @AfterClass
    public static void teardown() {
        WebDriverManager.getDriver().quit();
    }

}
