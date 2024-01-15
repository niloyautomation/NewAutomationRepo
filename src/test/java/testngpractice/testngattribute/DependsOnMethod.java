package testngpractice.testngattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    /*@Test
    public void loginToBank(){
        Assert.assertTrue(false);
        System.out.println("Login to bank site");
    }

    @Test(dependsOnMethods = {"loginToBank"}) //this method depends on above method
    public void fundTransfer(){
        System.out.println("10000 sent");  //this method will skip if loginToBank test fails
    }

    @Test
    public void fundTransferFromOtherBank(){
        System.out.println("500 sent");
    }*/
}
