package pt.Selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.SimpleFormatter;

public class SimpleFormDemoPage extends BasicPage{
    private static SimpleFormDemoPage instance;

    private WebElement singleInputField;
    private WebElement singleInputButon;
    By singleInputResult = By.id("display");


    public static SimpleFormDemoPage getInstance(){
        if(instance == null){
            instance = new SimpleFormDemoPage();
        }
        return instance;
    }

    public String getResult(String message){
        singleInputField.sendKeys(message);
        singleInputButon.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(singleInputResult));
        return webDriver.findElement(singleInputResult).getText();
    }



    public SimpleFormDemoPage() {
        webDriver.get(TEST_PAGE + "basic-first-form-demo.html");
        Init();
    }

    private void Init() {
        singleInputField = webDriver.findElement(By.id("user-message"));
        singleInputButon = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button"));
    }
}
