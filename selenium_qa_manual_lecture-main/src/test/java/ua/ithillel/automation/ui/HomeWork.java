package ua.ithillel.automation.ui;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void qAutoEnd2End() throws InterruptedException{

        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(2000);

        /*створення користувача*/
        driver.findElement(By.id("signupName")).sendKeys("Olga");
        Thread.sleep(1000);
        driver.findElement(By.id("signupLastName")).sendKeys("Kolomiiets");
        Thread.sleep(1000);
        driver.findElement(By.id("signupEmail")).sendKeys("olyakolomiec@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty123");
        Thread.sleep(1000);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.modal-footer > .btn-primary")).click();
        Thread.sleep(1000);

        /*перевірка в профайлі name і lastName*/
        driver.findElement(By.xpath("//a[@routerlink='profile']")).click();
        Thread.sleep(1000);
        WebElement nameLastname = driver.findElement(By.xpath("//p[@class='profile_name display-4']"));
        Assert.assertEquals("Incorrect Name/Lastname","Olga Kolomiiets",nameLastname.getText());
        Thread.sleep(1000);

        /*додати авто*/
        driver.findElement(By.xpath("//a[@routerlink='garage']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add car']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addCarMileage")).sendKeys("50");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(1000);

        /*додати expenses авто*/
        driver.findElement(By.xpath("//button[text()='Add fuel expense']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseMileage")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseMileage")).sendKeys("150");
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("20");
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("10");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(1000);

        /*видалення користувача*/
        driver.findElement(By.xpath("//a[@routerlink='settings']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-danger")).click();
        Thread.sleep(1000);
    }
    @After
    public void postCondition() {
        //Метод quit() завершує роботу драйвера, закриваючи всі пов’язані вікна.
        driver.quit();
    }

}
