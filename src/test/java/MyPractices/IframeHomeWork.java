package MyPractices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class IframeHomeWork extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2.“Our Products” butonuna basin
        WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//a[text()='Our Products']")).click();

        //3.“Cameras product”i tiklayin
        driver.findElement(By.xpath("(//p[@class='sub-heading'])[2]")).click();
        Thread.sleep(3000);

        //Popup mesajini yazdirin
        System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']")).getText());

        //5.“close” butonuna basin
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Thread.sleep(3000);
        //6."WebdriverUniversity.com IFrame )" linkini tiklayin
        driver.switchTo().parentFrame();
       driver.findElement(By.xpath("(//a[@class='navbar-brand'])[1]")).click();
        //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="http://webdriveruniversity.com/index.html";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
