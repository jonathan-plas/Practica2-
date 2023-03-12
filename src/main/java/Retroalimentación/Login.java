package Retroalimentación;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args){
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Escritorio\\Todas las Carpetas\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //Crear variables
        String user = "problem_user";
        String pass = "secret_sauce";

        //Localizadores Login
        WebElement usuario = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement btningresar = driver.findElement(By.className("submit-button"));


        //Interacción con la página
        usuario.sendKeys(user);
        password.sendKeys(pass);
        btningresar.click();
    }
}
