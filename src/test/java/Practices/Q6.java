package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Q6 {
     /*
   // 1. Amazon.com'a gidelim.
   // 2. DropDown üzerinde Books secelim.(All yazan yerde)
   //    kategorilerin hepsini konsola yazdiralim
   // 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
   // 4. Sonuc sayisini ekrana yazdiralim.
   // 5. Sonucların Les Miserables i icerdigini assert edelim
   */

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 1. Amazon.com'a gidelim.
        driver.get("https://www.amazon.com");
    }

    @AfterClass
    public static void tearDown() {
        //driver.close();
    }

    @Test
    public void test01(){

        // 2. DropDown üzerinde Books secelim.(All yazan yerde)
        //    kategorilerin hepsini konsola yazdiralim
        WebElement ddm=driver.findElement(By.xpath("//select[@title='Search in']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");
       List<WebElement> opsıyonlar= select.getOptions();
        for (WebElement w:opsıyonlar
             ) {
            System.out.println(w.getText());
        }
    }

    @Test
    public void test02(){
        //3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Les Miserables"+ Keys.ENTER);

        // 4. Sonuc sayisini ekrana yazdiralim.
        WebElement sonucYazsısı=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucYazsısı.getText());

        // 5. Sonucların Les Miserables i icerdigini assert edelim
        Assert.assertTrue(sonucYazsısı.getText().contains("Les Miserables"));
    }

}
