package Lesson9.pageOjects;

import Lesson9.Common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarPage extends Common {
    private By minAge =  By.id("f_o_18_min");
    private By minPrice = By.id("f_o_8_min");
    private By maxPrice = By.id("f_o_8_max");
    private By engineValue = By.id("f_o_15_max");
    private By color = By.id("f_o_17");
    private By searchButton = By.xpath("//input[@type='submit']");

    public void selectMinAge(String age){
        Select selectCarAge = new Select(driver.findElement(minAge));
        selectCarAge.selectByValue(age);
    }

    public void selectPrice(String min, String max){
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);
    }

    public void selectColor(String colorID){
        Select selectColor = new Select(driver.findElement(color));
        selectColor.selectByValue(colorID);
    }

    public void selectEngineValue(String value){
        Select selectEngine = new Select(driver.findElement(engineValue));
        selectEngine.selectByValue(value);
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

}
