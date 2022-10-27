import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class WebCalculatorPage extends BasePage {

    private WebDriver driver;

    public WebCalculatorPage(WebDriver driver){
        this.driver = driver;
    }

    public  void dimensions(){
        WebElement seven=DriverSingleton.getDriverInstance().findElement(By.id("seven"));
        System.out.println("element size"+seven.getSize());

    }

    public void displayed(){
        WebElement six=DriverSingleton.getDriverInstance().findElement(By.id("six"));
        System.out.println("six btn diplayed:"+six.isDisplayed());
    }

    public void  calculate(int num){
        clickElement(By.id("five"));
        clickElement(By.id("add"));
        clickElement(By.id("one"));
        clickElement(By.id("equal"));
        WebElement result=DriverSingleton.getDriverInstance().findElement(By.id("screen"));
        Assert.assertEquals(String.valueOf(result.getText()),String.valueOf(num));


    }




}

