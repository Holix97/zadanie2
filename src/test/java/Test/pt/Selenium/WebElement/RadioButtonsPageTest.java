package Test.pt.Selenium.WebElement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pt.Selenium.WebElement.RadioButtonsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioButtonsPageTest {
    private static RadioButtonsPage page = RadioButtonsPage.getInstance(); //done

    @AfterAll
    public static void closeDriver(){
        page.closeDriver();
    }

    @AfterEach
    public void closeDriver2(){
        page.waitForRefresh();
    }

    @Test
    public void p3_singleNullCheck(){
        String result = page.singleNullCheck();

        assertEquals("Radio button is Not checked", result);
    }

    @Test
    public void p3_singleMaleCheck(){
        String result = page.singleMaleCheck();

        assertEquals("Radio button 'Male' is checked", result);
    }

    @Test
    public void p3_singleFemaleCheck(){
        String result = page.singleFemaleCheck();

        assertEquals("Radio button 'Female' is checked", result);
    }

    @Test
    public void p3_multipleResultNull(){
        String result = page.multipleResult(5, 5);

        assertEquals("Sex :\n" + "Age group:", result);
    }

    @Test
    public void p3_multipleResultMale515(){
        String result = page.multipleResult(0, 1);

        assertEquals("Sex : Male\n" + "Age group: 5 - 15", result);
    }

    @Test
    public void p3_multipleResultNull515(){
        String result = page.multipleResult(5, 1);

        assertEquals("Sex :\n" + "Age group: 5 - 15", result);
    }
}