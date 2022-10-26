import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test01 extends BasePage {

    public void first(){
        clickElement(By.id("btn"));
        DriverSingleton.getDriverInstance().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickElement(By.id("message"));
    }

public void second()  {
    clickElement(By.id("hidden"));
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
public  void third(){
    clickElement(By.id("rendered"));
    WebDriverWait wait=new WebDriverWait(DriverSingleton.getDriverInstance(),10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));

//    clickElement(By.id("finish2"));

}

}
