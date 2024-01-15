package testngpractice.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestAnnotation {

    //by default it will execute alphabet wise, by default TestNG priority is 0
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.amazon.in/");
        driver.close();
    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.meesho.com/");
        driver.close();
    }

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.flipkart.com/");
        driver.close();
    }

    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://www.myntra.com/");
        driver.close();
    }
}
