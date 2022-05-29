package MyPractices;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase01_RegisterUser_withTeam extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //2. Navigate to url 'http://automationexercise.com'
        //2. 'http://automationexercise.com' adresine gidin
        driver.get("https://www.automationexercise.com");

        //3. Verify that home page is visible successfully
        //3- Anasayfanın gorunur oldugunu dogrulayin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.automationexercise.com/";
        Assert.assertEquals(expectedUrl, actualUrl);
        //4. Click on 'Signup / Login' button
        //4. 'Signup / Login' tuşuna basın
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //5. Verify 'New User Signup!' is visible
        //5. 'New User Signup!' yazısının gorunur oldugunu dogrulayin
        WebElement yazı = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(yazı.isDisplayed());
        //6. Enter name and email address
        //6. isim ve email adres girin
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        WebElement emailAdres = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        name.sendKeys("Gülşen");
        emailAdres.sendKeys("gulsengenctuncer@gmail.com");
        //7. Click 'Signup' button
        //7. 'Signup' tusuna basin
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        //8.  'ENTER ACCOUNT INFORMATION' yazisinin gorunur oldugunu dogrulayin
        WebElement yazı2 = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(yazı2.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        //9. Title, Name, Email, Password, Date of birth kisimlarini doldurun
        // baslik, isim, , mail, sifre, dogum gunu
        Actions actions = new Actions(driver);
        Faker faker=new Faker();
WebElement radıoButton=driver.findElement(By.xpath("//input[@value='Mrs']"));
actions.click(radıoButton)
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys("123456")
        .sendKeys("27")
        .sendKeys(Keys.TAB)
        .sendKeys("April")
        .sendKeys(Keys.TAB)
        .sendKeys("2022")
        .sendKeys(Keys.TAB)
        .click()
        .sendKeys(Keys.TAB)
        .click()
        .sendKeys(Keys.TAB)
        .sendKeys(faker.name().firstName())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.name().lastName())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.superhero().name())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.address().country())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.address().cityName())
        .sendKeys(Keys.TAB)
        .sendKeys("U")
        .sendKeys(Keys.TAB)
        .sendKeys(faker.name().firstName())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.name().firstName())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.name().firstName())
        .sendKeys(Keys.TAB)
        .sendKeys(faker.phoneNumber().cellPhone())
        .click()
        .perform();


        //10. Select checkbox 'Sign up for our newsletter!'
        //10. 'Sign up for our newsletter!' checkbox'i secin


        //11. Select checkbox 'Receive special offers from our partners!'
        //11. 'Receive special offers from our partners!' checkbox'i secin

        Thread.sleep(5000);
        //12. Fill details:
        // First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        // isim, soyisim, firma, adres, ikinci adres, ulke, eyalet, sehir, posta kodu , telefon numarasi

        //13. Click 'Create Account button'
        //13. 'Create Account button' tiklayin


        //14. Verify that 'ACCOUNT CREATED!' is visible
        //14. Verify that 'ACCOUNT CREATED!' gorunur oldugunu test edin


        //15. Click 'Continue' button
        //15. 'Continue' tusuna basin


        //16. Verify that 'Logged in as username' is visible
        //16. 'Logged in as username' gorunur oldugunu dogrulayin

        //17. Click 'Delete Account' button
        //17.  'Delete Account' tusuna basin


        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        //18. 'ACCOUNT DELETED!' yazisinin gorunu oldugunu dogrulayin ve 'Continue' tusuna basin

    }
}
