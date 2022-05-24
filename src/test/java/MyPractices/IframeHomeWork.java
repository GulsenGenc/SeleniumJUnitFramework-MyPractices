package MyPractices;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class IframeHomeWork extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2.“Our Products” butonuna basin
        driver.findElement(By.xpath("//a[text()='Our Products']")).click();

        //3.“Cameras product”i tiklayin
        driver.findElement(By.xpath("(//p[@class='sub-heading'])[2]")).click();
        Thread.sleep(3000);

        //Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        //5.“close” butonuna basin

        //6."WebdriverUniversity.com IFrame )" linkini tiklayin
        //7.
        //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin
    }
}
