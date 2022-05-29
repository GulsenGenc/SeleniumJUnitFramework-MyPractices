package MyPractices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class D19_WebtablesHomework extends TestBase {
    @Test
    public void test01() {
        // 1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

        //  2. Headers da bulunan department isimlerini yazdirin
        List<WebElement> headersList = driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
        //  headersList.stream().forEach(t-> System.out.println(t.getText()));//başlıkları lambda ile yazdırdık
        int departmentIndeks = 0;
        for (int i = 0; i < headersList.size(); i++) {
            if (headersList.get(i).getText().equals("Department")) {
                departmentIndeks = i;
            }
        }
        departmentIndeks++;

        List<WebElement> departmentList = driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td'][" + departmentIndeks + "]"));
        departmentList.stream().filter(t -> !(t.getText().equals(" "))).forEach(t -> System.out.println(t.getText()));

        //  3. 3. sutunun basligini yazdirin
        System.out.println(headersList.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("**Task04**");
        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tbody']")).getText());

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        List<WebElement> cellList=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td']"));
        System.out.println(cellList.size());

        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satırList=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println(satırList.size());

        //  7. Tablodaki sutun sayisini yazdirin
        System.out.println(headersList.size());//başlık sayısı aslında bıze sutun sayısını verır

        //  8. Tablodaki 3.kolonu yazdirin
        List<WebElement> colonUc=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']//div[@class='rt-td'][3]"));
        colonUc.stream().forEach(t-> System.out.println(t.getText()));

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        List<WebElement> isimlerList=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']//div[@class='rt-td'][1]"));
        List<WebElement> salaryList=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']//div[@class='rt-td'][5]"));
        for (int i = 0; i <isimlerList.size() ; i++) {
            if (isimlerList.get(i).getText().equals("Kierra")){
                System.out.println(salaryList.get(i).getText());
            }
        }
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        int satır=2;
        int sutun=2;
        dataGetir(satır,sutun);

    }

    private void dataGetir(int satır, int sutun) {
        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group'][" + sutun + "]//div[@class='rt-td'][" + satır + "]")).getText());
                                                       //şu kısmı olmasa da çalışır.çunku sıtede tek bır webtable var.


    }
}
