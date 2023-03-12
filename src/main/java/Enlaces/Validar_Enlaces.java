package Enlaces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Validar_Enlaces {
    String Url = "https://testsheepnz.github.io/BasicCalculator.html";
    public static WebDriver driver;
    String title = driver.getTitle();
    @BeforeMethod
    public void setup(){
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Escritorio\\Todas las Carpetas\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
    }
    @Test
    public void subir(){
        System.out.println("Hola");
    }

}
