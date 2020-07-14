package Lesson9.pageOjects;

import Lesson9.Common.Common;
import org.openqa.selenium.By;

public class DogAndCatPage extends Common {
    private By minAge = By.id("f_o_1276_min");
    private By maxAge = By.id("f_o_1276_max");
    private By searchButton = By.xpath("//input[@type='submit']");

    public void selectAgeAndSearch(String min, String max){
        driver.findElement(minAge).sendKeys(min);
        driver.findElement(maxAge).sendKeys(max);
        driver.findElement(searchButton).click();
    }

}
