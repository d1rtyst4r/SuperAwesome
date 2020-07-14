package Lesson9;

import Lesson9.pageOjects.CarPage;
import Lesson9.pageOjects.DogAndCatPage;
import Lesson9.pageOjects.HomePageSS;
import org.junit.Test;

public class Lesson10 {
    private HomePageSS homePageSS = new HomePageSS();
    private DogAndCatPage dogAndCatPage = new DogAndCatPage();
    private CarPage carPage = new CarPage();

    @Test
    public void Test1(){
        homePageSS.startBrowser("https://www.ss.lv/lv/");
        homePageSS.clickDogAndCatCategory();
        dogAndCatPage.selectAgeAndSearch("1", "10");
        dogAndCatPage.closeBrowres();
    }

    @Test
    public void Test2(){
        homePageSS.startBrowser("https://www.ss.lv/lv/");
        homePageSS.selectCarCategory();
        carPage.selectMinAge("2001");
        carPage.selectPrice("6000", "10000");
        carPage.selectColor("6318");
        carPage.selectEngineValue("3.0");
        carPage.clickSearchButton();
        carPage.closeBrowres();
    }


}
