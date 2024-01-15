package testngpractice.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    @Test
    public void hardAssertionExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
//        driver.get("https://www.amazon.in/");
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();


        /*String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals("amazon.in","amazon.in");
        driver.close();*/

        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(title,"Rediffmail","Rediffmail");
        //when hard assertion gets failed program terminates, that's why in most cases it is avoided
        driver.close();
    }
}
