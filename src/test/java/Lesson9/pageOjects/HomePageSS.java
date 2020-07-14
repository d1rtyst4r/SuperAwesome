package Lesson9.pageOjects;

import Lesson9.Common.Common;
import org.openqa.selenium.By;

public class HomePageSS extends Common {

    private By dogAndCats = By.id("mtd_300");

    private By carCategory = By.id("mtd_97");

    public void clickDogAndCatCategory() {
        driver.findElement(dogAndCats).click();
    }

    public void selectCarCategory(){
        driver.findElement(carCategory).click();
    }

}