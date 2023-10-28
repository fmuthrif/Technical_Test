package step;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooks extends env {
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fabia\\IdeaProjects\\Technical_Test\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
                driver.manage().window().maximize();
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions opt = new ChromeOptions();
//        opt.setHeadless(false);
//        driver = new ChromeDriver(opt);
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
    }

    @After
    public void after(){
    }
}
