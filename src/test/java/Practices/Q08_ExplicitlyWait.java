package Practices;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q08_ExplicitlyWait extends TestBase {
    //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
    //maximize the window
    //click on action dialog button
    //if need use explicitly wait
    //click on the ok button
    //accept the alert message


    @Test
    public void test01() {
        //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
        driver.get(" https://www.jqueryscript.net/demo/bootstrap-alert-box/");

        //click on action dialog button
        driver.findElement(By.xpath("//button[@id='action']")).click();

        //click on the ok button
        driver.findElement(By.xpath("//button[@class='btn btn-info btn-sm']")).click();

        //accept the alert message
        driver.switchTo().alert().accept();
    }
}
