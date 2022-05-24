package Practices;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q10_Iframe extends TestBase {
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
    // web sitesini maximize yapin
    // ikinci emojiye tıklayın
    // tüm ikinci emoji öğelerini tıklayın
    // parent iframe e geri donun
    // formu doldurun,(Formu istediğiniz metinlerle doldurun)
    //  apply button a basin


    @Test
    public void test01() {
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        // web sitesini maximize yapin
        // ikinci emojiye tıklayın
        driver.findElement(By.xpath("(//img[@class='emoji'])[9]"));
        // tüm ikinci emoji öğelerini tıklayın
        // parent iframe e geri donun
        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        //  apply button a basin
    }
}
