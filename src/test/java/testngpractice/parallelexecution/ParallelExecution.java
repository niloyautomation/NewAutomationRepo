package testngpractice.parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelExecution {

    //add parallel and thread count attribute in XML file to achieve parallel execution

    @Test
    public void parallelExecute1(){
        //to use SoftAssertion we must create SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Rediffmail","Rediffmail title should be matched");
        //if any assertion fails still the program executes
        Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login textBox should be enabled");
        WebElement elementRemember = driver.findElement(By.id("remember"));
        elementRemember.click();
        Assert.assertFalse(elementRemember.isSelected(),"Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }

    @Test
    public void parallelExecute2(){
        //to use SoftAssertion we must create SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Rediffmail","Rediffmail title should be matched");
        //if any assertion fails still the program executes
        Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login textBox should be enabled");
        WebElement elementRemember = driver.findElement(By.id("remember"));
        elementRemember.click();
        Assert.assertFalse(elementRemember.isSelected(),"Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }

    @Test
    public void parallelExecute3(){
        //to use SoftAssertion we must create SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Rediffmail","Rediffmail title should be matched");
        //if any assertion fails still the program executes
        Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login textBox should be enabled");
        WebElement elementRemember = driver.findElement(By.id("remember"));
        elementRemember.click();
        Assert.assertFalse(elementRemember.isSelected(),"Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }

    @Test
    public void parallelExecute4(){
        //to use SoftAssertion we must create SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NILOY\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Chrome driver object
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Rediffmail","Rediffmail title should be matched");
        //if any assertion fails still the program executes
        Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login textBox should be enabled");
        WebElement elementRemember = driver.findElement(By.id("remember"));
        elementRemember.click();
        Assert.assertFalse(elementRemember.isSelected(),"Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }
}
