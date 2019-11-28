import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NewFeatures extends Initialization {

    private LoginPage loginPage = new LoginPage();
    private GlassDocumentationPage glassDocumentationPage = new GlassDocumentationPage();
    private ProjectConfigurationDocumentationPage pJDoc = new ProjectConfigurationDocumentationPage();


    @BeforeEach
    public void setup() {
        loginPage.loginWithValidData();
    }


    @Test
    public void workFlowTransVisible() {
        glassDocumentationPage.goToProjectConfigDoc("/projects/PROJ?selectedItem=com.codecanvas.glass:glass", "Task");
        assertTrue(pJDoc.getTransitionsTable().isDisplayed());
    }

    @Test
    public void checkIfPostFunctionsDisplayed(){
        glassDocumentationPage.goToProjectConfigDoc("/projects/PROJ?selectedItem=com.codecanvas.glass:glass", "Task");
        pJDoc.expandWorkFlowTransitionByName("Create");
        pJDoc.openPostFunctionDetails();

    }

    @Test
    public void checkChangeButtonIsDisplayed(){
        glassDocumentationPage.goToVersions("/projects/PROJ?selectedItem=com.codecanvas.glass:glass");
        glassDocumentationPage.goToSchemes();
        assertTrue(glassDocumentationPage.getChangeButton().isDisplayed());
    }

}
