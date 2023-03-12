package Swaglabs;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
     WebDriver driver;

    @Before
    public void  setup(){
        String Url = "https://www.saucedemo.com/";
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Escritorio\\Todas las Carpetas\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
    }
    @Test
    public void login() throws InterruptedException{
        String user = "standard_user";
        String pass= "secret_sauce";

        WebElement usuario = driver.findElement(By.id("user-name"));
        usuario.sendKeys(user);
        WebElement password = driver.findElement(By.cssSelector("input :nth-child(1)"));
        //WebElement password = driver.findElement(By.cssSelector("input[name= 'password']"));
        password.sendKeys(pass);
    }
}
