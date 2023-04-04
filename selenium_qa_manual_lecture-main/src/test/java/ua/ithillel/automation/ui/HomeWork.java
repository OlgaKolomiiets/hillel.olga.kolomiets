package ua.ithillel.automation.ui;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    private WebDriver driver;

    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void qAutoEnd2End() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @After
    public void postCondition() {
        //Метод quit() завершує роботу драйвера, закриваючи всі пов’язані вікна.
        driver.quit();
    }

}
