package MyPractices;

import org.junit.Test;
import utilities.TestBase;

public class GenelTekrarTestleri extends TestBase {

    @Test
    public void test01() {
        //1-amazon gidin
        driver.get("https://www.amazon.com");
        //2 Arama kutusunun solundaki drop down menuyu handle edip listesini ekrana yazdırın

        //3 drop down menude 40 eleman olduğunu doğrulayın
    }

    @Test
    public void test02() {
        //1-dropdown menuden elektronik bölümü seçin
        //2-arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırı n
        //3-sonuc sayisi bildiren yazinin iphone icerdigini test edin
        //4-ikinci ürüne relative locater kullanarak tıklay in
        //5-ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
    }

    @Test
    public void test03() {
        //1 yeni bir sekme açarak amazon anasayfaya gid in
        //2 dropdown’dan bebek bölümüne secin
        //3 bebek puset aratıp bulundan sonuç sayısını yazdırın
        //4 sonuç yazsının puset içerdiğini te st edin
        //5 üçüncü ürüne relative locater kullanarak tıklay in
        //6 title ve fiyat bilgilerini assign edelim ve ürünü sepete ekley in
    }
}
