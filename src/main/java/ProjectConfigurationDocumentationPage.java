import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectConfigurationDocumentationPage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id='glass-workflow-transitions-title']")
    private WebElement transitionsTitle;

    @FindBy(xpath = "//*[@id='glass-workflow-transitions']")
    private WebElement transitionsTable;

    @FindBy(xpath = "//li[@class='menu-item active-tab']//a[contains(text(), 'Post Functions')]")
    private WebElement postFunctionButton;

    @FindBy(xpath = "//li[@class='menu-item active-tab']//a[contains(text(), 'Validators ')]")
    private WebElement validatorsButton;

    @FindBy(xpath = "//li[@class='menu-item active-tab']//a[contains(text(), 'Post Functions')]")
    private WebElement conditionsButton;


    ProjectConfigurationDocumentationPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void expandWorkFlowTransitionByName(String transName) {
        driver.findElement(By.xpath("//*[@class='transition-row' ]//b[contains(text(), '" + transName + "')]"));
    }

    public void openPostFunctionDetails(){
        postFunctionButton.click();
    }


    public WebElement getTransitionsTitle() {
        return transitionsTitle;
    }

    public WebElement getTransitionsTable() {
        return transitionsTable;
    }
}
