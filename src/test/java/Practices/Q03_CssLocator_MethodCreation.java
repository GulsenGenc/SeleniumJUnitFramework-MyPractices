package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class  Q03_CssLocator_MethodCreation {
    /*
   // http://the-internet.herokuapp.com/add_remove_elements/
   // click on the "Add Element" button 100 times
   // write a function that takes a number, and clicks the "Delete" button
   // given number of times, and then validates that given number of
   // buttons was deleted
   1.method : createButtons(100)
   2.deleteButtonsAndValidate()
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
       driver.close();
    }

    @Test
    public void test01() {
        //adrese gıdelım
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        //AddElement buttonunu locate edıp 100 defa tıklayalım
        WebElement ekle = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i < 100; i++) {
            ekle.click();
        }
    }

    private static void deleteButtonsAndValidate(WebDriver driver, int number) {
        List<WebElement> elements = driver.findElements(By.cssSelector("[onclick= 'deleteElement()']"));
        int sizebeforeDelete = elements.size();

        List<WebElement> buttonsDelete = driver.findElements(By.cssSelector("[onclick= 'deleteElement()']"));
        int sayac= 0;

        for (WebElement w :buttonsDelete){ //silecegim webelemente click yapiyorum
            sayac ++;
            if(sayac>number){
                break;
            }
            w.click();
        }

        List<WebElement> elementsAfter = driver.findElements(By.cssSelector("[onclick= 'deleteElement()']"));
        int sizeafterDelete = elementsAfter.size();//sildikten sonra kalanlar

        if((sizebeforeDelete-number)==sizeafterDelete){
            System.out.println("sizeafterDelete = " + sizeafterDelete);
            System.out.println("SUCCESS");
        }else
            System.out.println("FAIL!");


    }




}
