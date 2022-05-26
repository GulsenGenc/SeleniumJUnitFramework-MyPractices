package MyPractices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class WindowHandleHomeWork extends TestBase {

    @Test
    public void test01() {

        //  1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");
        String ilkWindowHandle= driver.getWindowHandle();

        //2."Login Portal" a kadar asagi inin
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();

        //3."Login Portal" a tiklayin
        driver.findElement(By.xpath("(//h4)[2]")).click();

        //4.Diger window'a gecin
        Set<String> handleDgerleri=driver.getWindowHandles();
        String ikinciWindowHandle="";
        for (String w: handleDgerleri
             ) {
            if (!w.equals(ilkWindowHandle)){
                ikinciWindowHandle=w;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);

        //5."username" ve "password" kutularina deger yazdirin
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Gulsen genc");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("asdfg");

        //6."login" butonuna basin
        driver.findElement(By.xpath("//button[@id='login-button']")).click();

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        String expectedYazı="validation failed";
        String actualYazı=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedYazı,actualYazı);

        //8.Ok diyerek Popup'i kapatin
        //9.Ilk sayfaya geri donun
        //10.Ilk sayfaya donuldugunu test edin
    }
}
