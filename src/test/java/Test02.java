import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNGException;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test02 extends BasePage {

    public void first(){
        DriverSingleton.getDriverInstance().findElement(ByAngular.model("firstName")).clear();
        String myName="coral";
        DriverSingleton.getDriverInstance().findElement(ByAngular.model("firstName")).sendKeys(myName);

//        DriverSingleton.getDriverInstance().close();

    }


}
