package Lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lesson9 {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize Chrome window
    }

    @After
    public void teardown(){
        if (driver != null){
            driver.quit();
        }
    }
    @Test
    public void Test1(){
        driver.get("https://www.ss.lv/lv/");
        //WebElement dogAndCats = driver.findElement(By.id("mtd_300"));
        //dogAndCats.click();
        WebElement ageInput = driver.findElement(By.id("f_o_1276_min"));
        ageInput.sendKeys("1");
        driver.quit();
    }
    @Test
    public void Test2() throws InterruptedException {
        driver.get("https://www.ss.lv/lv/transport/cars/filter/");
//        WebElement cars = driver.findElement(By.id("mtd_97"));
//        cars.click();


        Select yearMinInput = new Select(driver.findElement(By.id("f_o_18_min")));
        yearMinInput.selectByValue("2001");
        WebElement minPriceInput = driver.findElement(By.id("f_o_8_min"));
        WebElement maPriceInput = driver.findElement(By.id("f_o_8_max"));
        Select engineValueInput = new Select(driver.findElement(By.id("f_o_15_max")));
        minPriceInput.sendKeys("6000");
        maPriceInput.sendKeys("10000");
        engineValueInput.selectByValue("3.0");
        Select colorInput = new Select(driver.findElement(By.id("f_o_17")));
        colorInput.selectByValue("6318");

    }
    @Test
    public void Test3() throws InterruptedException {
        String driverPath = "C:\\Users\\d1rty\\Google Drive\\JavaGuruQA2\\SuperAwesome\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        Thread.sleep(5000);
        WebElement comercial = driver.findElementByClassName("close-layer");
        comercial.click();
        WebElement search = driver.findElement(By.id("search-key"));
        search.sendKeys("tattoo");
        WebElement searchButton = driver.findElement(By.className("search-button"));
        search.click();


    }
}
