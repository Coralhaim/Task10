import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    @BeforeClass
    public static void runOnceBeforeClass(){
        DriverSingleton.getDriverInstance().get("https://dgotlieb.github.io/AngularJS/main.html");
    }


    @Test
//    public void test01(){
//        Test01 newTest=new Test01();
//        newTest.first();
//        newTest.second();
//        newTest.third();
//
//    }

    public void test02(){
        Test02 newtest=new Test02();
        newtest.first();

    }
// 03- we will use  pageloadout when we cant find element. if we cant find the
//  element we will get TimeOutException


}
