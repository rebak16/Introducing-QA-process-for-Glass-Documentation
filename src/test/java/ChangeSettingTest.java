import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeSettingTest {
    private LoginPage loginPage = new LoginPage();
    private ProjectPage projectPage = new ProjectPage();
    private GlassDocumentationPage glassDocumentationPage = new GlassDocumentationPage();

    @BeforeEach
    public void setup() {
        loginPage.loginWithValidData();
    }

    @Test
    public void checkChangeSetting(){
        glassDocumentationPage.goToProjectPage("/projects/PROJ?selectedItem=com.codecanvas.glass:glass");
        glassDocumentationPage.goToSchemes();
        assertTrue(glassDocumentationPage.getChangeText().isDisplayed());
    }
}
