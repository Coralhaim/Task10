import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class POMTest  {

   public  static WebDriver driver;

   @BeforeClass
   public static void runOnceBeforeClass() {
       System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
       DriverSingleton.getDriverInstance().get("https://dgotlieb.github.io/WebCalculator/");
   }
   @Test
    public void test04(){
       WebCalculatorPage newpage=new WebCalculatorPage(driver);
       newpage.dimensions();
       newpage.displayed();
       newpage.calculate(6);

   }
    @AfterClass
    public static void tearDown() {
      DriverSingleton.getDriverInstance().quit();
    }

}
