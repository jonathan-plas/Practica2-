package Ejercicio2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practica {
   private WebDriver driver;

   @Before
    public void  setup(){
       String Url = "https://demoqa.com/text-box";
       System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Escritorio\\Todas las Carpetas\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(Url);
   }
    @Test
    public void google(){
       String nombre = "Jonathan";

        //Localizadores
        WebElement fullname = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        WebElement comentario = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));

        //Interaccion con la pagina
        fullname.sendKeys(nombre);
        email.sendKeys("csdsdcsdc");
        comentario.sendKeys("dfvmflvndlkvndkvndknvkdfvndflvnlf");
   }
}
