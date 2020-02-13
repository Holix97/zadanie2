package Test.pt.Selenium.WebElement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import pt.Selenium.WebElement.SimpleFormDemoPage;

import static org.junit.jupiter.api.Assertions.*;

class SimpleFormDemoPageTest {
    private static SimpleFormDemoPage page = SimpleFormDemoPage.getInstance();

    @AfterAll
    public static void closeDriver(){
        page.closeDriver();
    }

    @Test
    public void SingleInputSendKey(){
        String myMessage = "GIT";
        String result = page.getResult(myMessage);

        assertEquals(myMessage, result);
    }

}