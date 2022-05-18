package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Q2 {
    /*
   http://www.bestbuy.com 'a gidin,
   Sayfa basliginin "Best" icerdigini(contains) dogrulayin
   Ayrica Relative Locator kullanarak;
       logoTest => BestBuy logosunun gorunutulenip goruntulenmedigini dogrulayin
       mexicoLinkTest => Linkin gorunutulenip goruntulenmedigini dogrulayin
*/
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public static void tearDown() {
        //driver.close();
    }

    @Before
    public void testlerdenOnce() {
        //   http://www.bestbuy.com   adresine gidin
        driver.get("http://www.bestbuy.com");

    }

    @Test
    public void baslıkTesti() {
        //    Sayfa basliginin "Best" icerdigini(contains) dogrulayin
        Assert.assertTrue("Best kelimesi içermiyor.", driver.getTitle().contains("Best"));
    }

    @Test
    public void logoTest() {
        //BestBuy logosunun gorunutulenip goruntulenmedigini dogrulayin
      // WebElement BestBuyLogo=driver.findElement(By.xpath("//img[@class='logo']"));
       WebElement helloHeading=driver.findElement(By.xpath("//div[@class='heading']"));
        WebElement bestBuyLogo=driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloHeading));
        Assert.assertTrue(bestBuyLogo.isDisplayed());
    }

    @Test
    public void mexicoLinkTest() {
        //    mexicoLinkTest => Linkin gorunutulenip goruntulenmedigini dogrulayin
        WebElement usaLınk= driver.findElement(By.xpath("//img[@alt='United States']"));
        WebElement mexicoLink=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(usaLınk));
        Assert.assertTrue(mexicoLink.isDisplayed());
    }
}
