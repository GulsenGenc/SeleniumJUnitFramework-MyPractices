package MyPractices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ActionsClassHomeWork extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //1-"http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2-Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);
        WebElement homfKutusu = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        actions.moveToElement(homfKutusu).perform();
        Thread.sleep(3000);

        //3-Link 1" e tiklayin
        driver.findElement(By.xpath("//a[@class='list-alert']")).click();

        //4-P opup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        //5-Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //6-“Click and hold" kutusuna basili tutun
        WebElement kutu = driver.findElement(By.xpath("//div[@id='click-box']"));
        actions.clickAndHold(kutu).perform();
        Thread.sleep(3000);

        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(kutu.getText());

        //8-“Double click me" butonunu cift tiklayin
        WebElement doubleClickBtonu= driver.findElement(By.tagName("h2"));
        actions.doubleClick(doubleClickBtonu).perform();
        Thread.sleep(3000);
    }
}
