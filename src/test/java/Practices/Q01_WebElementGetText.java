package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01_WebElementGetText{
    // BeforeClass ile driver ı olusturun ve class icinde static yapin
    //    Maximize edin, 15 sn bekletin

    //    AfterClass ile kapatın
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
        driver.close();
    }
    @Before
    public void testlerdenOnce(){
        //    http://www.google.com adresine gidin
        driver.get("http://www.google.com");

    }
    @After
    public void testlerdenSonra(){
        WebElement sonucYazısı= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("sonuç yazısı-->"+sonucYazısı.getText());
    }

    @Test
    public void test01() {

        //    arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        aramaKutusu.sendKeys("Green Mile" );
        aramaKutusu.submit();//buda arama kutusunu enter yapma ile aynı işlevde
    }

    @Test
    public void test02(){
        //    arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        aramaKutusu.sendKeys("Premonition" + Keys.ENTER);
    }

    @Test
    public void test03(){
        //    arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        aramaKutusu.sendKeys("The Curious Case of Benjamin Button" + Keys.ENTER);

    }
}
